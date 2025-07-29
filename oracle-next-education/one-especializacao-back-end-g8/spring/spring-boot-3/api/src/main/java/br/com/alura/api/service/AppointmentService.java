package br.com.alura.api.service;

import br.com.alura.api.exception.BusinessRuleException;
import br.com.alura.api.model.Appointment;
import br.com.alura.api.model.Doctor;
import br.com.alura.api.model.Patient;
import br.com.alura.api.model.dto.AppointmentDetailDTO;
import br.com.alura.api.model.dto.AppointmentSchedulingDTO;
import br.com.alura.api.repository.AppointmentRepository;
import br.com.alura.api.repository.DoctorRepository;
import br.com.alura.api.repository.PatientRepository;
import br.com.alura.api.service.validation.AppointmentSchedulingValidator;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AppointmentService {

    private final DoctorRepository doctorRepository;
    private final PatientRepository patientRepository;
    private final AppointmentRepository appointmentRepository;
    private final List<AppointmentSchedulingValidator> validators;

    public AppointmentService(DoctorRepository doctorRepository, PatientRepository patientRepository, AppointmentRepository appointmentRepository, List<AppointmentSchedulingValidator> validators) {
        this.doctorRepository = doctorRepository;
        this.patientRepository = patientRepository;
        this.appointmentRepository = appointmentRepository;
        this.validators = validators;
    }

    @Transactional
    public AppointmentDetailDTO schedule(AppointmentSchedulingDTO dto) {
        validators.forEach(v -> v.validate(dto));

        Patient patient = patientRepository.findById(dto.patientId())
                .orElseThrow(() -> new EntityNotFoundException("ID do paciente não encontrada!"));

        Doctor doctor = chooseDoctor(dto);

        if (doctor == null) {
            throw new BusinessRuleException("Nenhum médico disponível para a especialidade e data especificadas.");
        }

        Appointment appointment = new Appointment(null, doctor, patient, dto.date());
        appointmentRepository.save(appointment);
        return new AppointmentDetailDTO(appointment);
    }

    private Doctor chooseDoctor(AppointmentSchedulingDTO dto) {
        if (dto.doctorId() != null) {
            return doctorRepository.findById(dto.doctorId())
                    .orElseThrow(() -> new EntityNotFoundException("ID do médico não encontrado!"));
        }

        if (dto.specialty() == null) {
            throw new IllegalArgumentException("A especialidade é necessária quando nenhum médico é escolhido.");
        }

        return doctorRepository.chooseFreeRandomDoctorOnDate(dto.specialty(), dto.date());
    }
}
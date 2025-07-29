package br.com.alura.api.service.validation;

import br.com.alura.api.exception.BusinessRuleException;
import br.com.alura.api.model.dto.AppointmentSchedulingDTO;
import br.com.alura.api.repository.AppointmentRepository;
import jakarta.validation.ValidationException;
import org.springframework.stereotype.Component;

@Component
public class DoctorAvailabilityValidator implements AppointmentSchedulingValidator {

    private final AppointmentRepository appointmentRepository;

    public DoctorAvailabilityValidator(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    public void validate(AppointmentSchedulingDTO dto) {
        if (dto.doctorId() == null) {
            return;
        }

        boolean isDoctorBusy = appointmentRepository.existsByDoctorIdAndDate(dto.doctorId(), dto.date());

        if (isDoctorBusy) {
            throw new BusinessRuleException("Doctor is already busy at this time.");
        }
    }
}
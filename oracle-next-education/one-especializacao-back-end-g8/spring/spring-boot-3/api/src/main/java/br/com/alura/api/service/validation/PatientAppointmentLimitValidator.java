package br.com.alura.api.service.validation;

import br.com.alura.api.exception.BusinessRuleException;
import br.com.alura.api.model.dto.AppointmentSchedulingDTO;
import br.com.alura.api.repository.AppointmentRepository;
import jakarta.validation.ValidationException;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
public class PatientAppointmentLimitValidator implements AppointmentSchedulingValidator {

    private final AppointmentRepository appointmentRepository;

    public PatientAppointmentLimitValidator(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    public void validate(AppointmentSchedulingDTO dto) {
        LocalDateTime appointmentDate = dto.date();
        LocalDateTime startOfDay = appointmentDate.withHour(0).withMinute(0).withSecond(0);
        LocalDateTime endOfDay = appointmentDate.withHour(23).withMinute(59).withSecond(59);

        boolean patientHasAnotherAppointmentOnDay = appointmentRepository.existsByPatientIdAndDateBetween(dto.patientId(), startOfDay, endOfDay);

        if (patientHasAnotherAppointmentOnDay) {
            throw new BusinessRuleException("Patient already has an appointment scheduled for this day.");
        }
    }
}
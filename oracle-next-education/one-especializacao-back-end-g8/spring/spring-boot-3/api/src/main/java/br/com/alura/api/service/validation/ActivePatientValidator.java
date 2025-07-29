package br.com.alura.api.service.validation;

import br.com.alura.api.exception.BusinessRuleException;
import br.com.alura.api.model.dto.AppointmentSchedulingDTO;
import br.com.alura.api.repository.PatientRepository;
import jakarta.validation.ValidationException;
import org.springframework.stereotype.Component;

@Component
public class ActivePatientValidator implements AppointmentSchedulingValidator {

    private final PatientRepository patientRepository;

    public ActivePatientValidator(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public void validate(AppointmentSchedulingDTO dto) {
        if (dto.patientId() == null) {
            return;
        }

        boolean isPatientActive = patientRepository.existsByIdAndIsActiveTrue(dto.patientId());

        if (!isPatientActive) {
            throw new BusinessRuleException("Cannot schedule appointment with an inactive patient.");
        }
    }
}
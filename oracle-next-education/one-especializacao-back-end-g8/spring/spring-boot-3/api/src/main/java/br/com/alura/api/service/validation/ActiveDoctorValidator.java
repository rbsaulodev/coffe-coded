package br.com.alura.api.service.validation;

import br.com.alura.api.exception.BusinessRuleException;
import br.com.alura.api.model.dto.AppointmentSchedulingDTO;
import br.com.alura.api.repository.DoctorRepository;
import jakarta.validation.ValidationException;
import org.springframework.stereotype.Component;

@Component
public class ActiveDoctorValidator implements AppointmentSchedulingValidator {

    private final DoctorRepository doctorRepository;

    public ActiveDoctorValidator(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    public void validate(AppointmentSchedulingDTO dto) {
        if (dto.doctorId() == null) {
            return;
        }

        boolean isDoctorActive = doctorRepository.existsByIdAndIsActiveTrue(dto.doctorId());

        if (!isDoctorActive) {
            throw new BusinessRuleException("Cannot schedule appointment with an inactive doctor.");
        }
    }
}
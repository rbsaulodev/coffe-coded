package br.com.alura.api.service.validation;

import br.com.alura.api.model.dto.AppointmentSchedulingDTO;

public interface AppointmentSchedulingValidator {
    void validate(AppointmentSchedulingDTO dto);
}

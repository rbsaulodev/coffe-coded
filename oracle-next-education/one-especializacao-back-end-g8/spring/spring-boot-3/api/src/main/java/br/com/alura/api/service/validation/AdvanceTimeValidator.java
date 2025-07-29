package br.com.alura.api.service.validation;

import br.com.alura.api.exception.BusinessRuleException;
import br.com.alura.api.model.dto.AppointmentSchedulingDTO;

import java.time.Duration;
import java.time.LocalDateTime;

public class AdvanceTimeValidator implements AppointmentSchedulingValidator{

    private static final long MINIMUM_ADVANCE_NOTICE_IN_MINUTES = 30;

    public void validate(AppointmentSchedulingDTO dto) {
        LocalDateTime appointmentDateTime = dto.date();
        LocalDateTime now = LocalDateTime.now();

        long minutesDifference = Duration.between(now, appointmentDateTime).toMinutes();

        if (minutesDifference < MINIMUM_ADVANCE_NOTICE_IN_MINUTES) {
            throw new BusinessRuleException("A consulta deve ser agendada pelo menos: " + MINIMUM_ADVANCE_NOTICE_IN_MINUTES + " minutos de antecedência.");
        }
    }

}
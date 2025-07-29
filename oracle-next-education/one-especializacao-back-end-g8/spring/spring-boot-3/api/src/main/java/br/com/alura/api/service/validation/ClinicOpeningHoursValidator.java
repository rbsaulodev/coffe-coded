package br.com.alura.api.service.validation;

import br.com.alura.api.exception.BusinessRuleException;
import br.com.alura.api.model.dto.AppointmentSchedulingDTO;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class ClinicOpeningHoursValidator {
    private static final int OPENING_HOUR = 7;
    private static final int CLOSING_HOUR = 19;

    public void validate(AppointmentSchedulingDTO dto) {
        LocalDateTime appointmentDateTime = dto.date();
        DayOfWeek dayOfWeek = appointmentDateTime.getDayOfWeek();
        int hourOfDay = appointmentDateTime.getHour();

        boolean isSunday = dayOfWeek.equals(DayOfWeek.SUNDAY);
        boolean isBeforeOpening = hourOfDay < OPENING_HOUR;
        boolean isAfterClosing = hourOfDay >= CLOSING_HOUR;

        if (isSunday || isBeforeOpening || isAfterClosing) {
            throw new BusinessRuleException("O atendimento é fora do horário comercial (segunda a sábado, das 07:00 às 19:00).");
        }
    }
}

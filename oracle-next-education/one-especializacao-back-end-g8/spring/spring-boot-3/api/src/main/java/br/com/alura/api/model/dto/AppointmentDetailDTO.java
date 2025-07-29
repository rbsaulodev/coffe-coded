package br.com.alura.api.model.dto;

import br.com.alura.api.model.Appointment;
import java.time.LocalDateTime;

public record AppointmentDetailDTO(
        Long id,
        Long doctorId,
        Long patientId,
        LocalDateTime date
) {
    public AppointmentDetailDTO(Appointment appointment) {
        this(appointment.getId(), appointment.getDoctor().getId(), appointment.getPatient().getId(), appointment.getDate());
    }
}
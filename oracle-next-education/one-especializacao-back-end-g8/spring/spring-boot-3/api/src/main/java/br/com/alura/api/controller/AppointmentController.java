package br.com.alura.api.controller;

import br.com.alura.api.model.dto.AppointmentDetailDTO;
import br.com.alura.api.model.dto.AppointmentSchedulingDTO;
import br.com.alura.api.service.AppointmentService;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/appointments")
@SecurityRequirement(name = "bearer-key")
public class AppointmentController {

    private final AppointmentService appointmentService;

    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    @PostMapping
    public ResponseEntity<AppointmentDetailDTO> scheduleAppointment(
            @RequestBody @Valid AppointmentSchedulingDTO dto,
            UriComponentsBuilder uriBuilder) {

        var appointmentDetails = appointmentService.schedule(dto);

        URI uri = uriBuilder.path("/appointments/{id}")
                .buildAndExpand(appointmentDetails.id())
                .toUri();

        return ResponseEntity.created(uri).body(appointmentDetails);
    }
}

package br.com.alura.api.model.dto;

import br.com.alura.api.model.enums.Specialty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DoctorDTO(
        Long id,

        @NotBlank
        String name,

        @NotBlank
        @Email
        String email,
        String doctorNumber,

        @NotBlank
        @Pattern(regexp = "\\d{4,6}")
        String crm,

        @NotNull
        Specialty specialty,

        @NotNull
        @Valid
        AddressDTO address
) {
}

package br.com.alura.api.model.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public record PatientUpdateDTO(
        @NotNull
        Long id,
        String name,
        String telefone,
        @Valid
        AddressDTO address
) {}
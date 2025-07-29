package br.com.alura.api.model.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record AddressDTO(
        @NotBlank
        String street,

        @NotBlank
        String neighborhood,

        @NotBlank
        @Pattern(regexp = "\\d{8}", message = "Zip code must be 8 digits.")
        String zipCode,

        @NotBlank
        String city,

        @NotBlank
        String state,

        int addressNumber,
        String complement
) {}
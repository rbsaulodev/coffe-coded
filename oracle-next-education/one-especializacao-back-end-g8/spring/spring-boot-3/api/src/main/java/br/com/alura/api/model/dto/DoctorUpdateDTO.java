package br.com.alura.api.model.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;

public record DoctorUpdateDTO (

        Long id,

        @NotBlank
        String name,

        String doctorNumber,

        @Valid
        AddressDTO address
){
}

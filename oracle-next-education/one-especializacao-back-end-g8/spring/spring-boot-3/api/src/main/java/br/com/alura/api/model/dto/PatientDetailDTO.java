package br.com.alura.api.model.dto;

import br.com.alura.api.model.Address;
import br.com.alura.api.model.Patient;

public record PatientDetailDTO(
        Long id,
        String name,
        String email,
        String cpf,
        String telefone,
        Address address
) {

    public PatientDetailDTO(Patient patient) {
        this(
                patient.getId(),
                patient.getName(),
                patient.getEmail(),
                patient.getCpf(),
                patient.getTelefone(),
                patient.getAddress()
        );
    }
}
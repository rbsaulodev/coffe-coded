package br.com.alura.api.model.dto;

import br.com.alura.api.model.Patient;

public record PatientListDTO(
        Long id,
        String name,
        String email,
        String cpf
) {
    public PatientListDTO(Patient patient) {
        this(patient.getId(), patient.getName(), patient.getEmail(), patient.getCpf());
    }
}
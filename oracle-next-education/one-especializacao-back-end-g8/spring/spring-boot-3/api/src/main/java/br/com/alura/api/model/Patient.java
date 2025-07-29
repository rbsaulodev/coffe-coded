package br.com.alura.api.model;

import br.com.alura.api.model.dto.PatientRegistrationDTO;
import br.com.alura.api.model.dto.PatientUpdateDTO;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "patients")
@Entity(name = "Patient")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String telefone;
    private String cpf;

    @Embedded
    private Address address;
    private Boolean isActive;

    public Patient(PatientRegistrationDTO dto) {
        this.isActive = true;
        this.name = dto.name();
        this.email = dto.email();
        this.telefone = dto.telefone();
        this.cpf = dto.cpf();
    }

    public void updateInformation(PatientUpdateDTO dto) {
        if (dto.name() != null) {
            this.name = dto.name();
        }
        if (dto.telefone() != null) {
            this.telefone = dto.telefone();
        }
    }

    public void deactivate() {
        this.isActive = false;
    }
}
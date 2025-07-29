package br.com.alura.api.model;

import br.com.alura.api.model.dto.DoctorRegistrationDTO;
import br.com.alura.api.model.dto.DoctorUpdateDTO;
import br.com.alura.api.model.enums.Specialty;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "doctors")
@Entity(name = "Doctor")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Doctor {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String doctorNumber;
    private String crm;
    private Boolean isActive;

    @Enumerated(EnumType.STRING)
    private Specialty specialty;
    @Embedded
    private Address address;

    public void updateDoctor(DoctorUpdateDTO findDoctor) {
        if (findDoctor.name() != null){
            this.name = findDoctor.name();
        }
        if (findDoctor.doctorNumber() != null){
            this.doctorNumber = findDoctor.doctorNumber();
        }
        if (findDoctor.address() != null){
            this.address.updateAddress(findDoctor.address());
        }
    }


    public Doctor(DoctorRegistrationDTO dto) {
        this.isActive = true;
        this.name = dto.name();
        this.email = dto.email();
        this.doctorNumber = dto.phone();
        this.crm = dto.crm();
        this.specialty = dto.specialty();
        this.address = new Address(dto.address());
    }
}

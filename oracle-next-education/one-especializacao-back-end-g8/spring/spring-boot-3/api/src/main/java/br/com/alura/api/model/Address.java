package br.com.alura.api.model;

import br.com.alura.api.model.dto.AddressDTO;
import jakarta.persistence.Embeddable;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    private String street;
    private String complement;
    private int addressNumber;
    private String neighborhood;
    private String city;
    private String state;
    private String zipCode;

    public Address(AddressDTO dto) {
        this.street = dto.street();
        this.neighborhood = dto.neighborhood();
        this.zipCode = dto.zipCode();
        this.city = dto.city();
        this.state = dto.state();
        this.addressNumber = dto.addressNumber();
        this.complement = dto.complement();
    }

    public void updateAddress(AddressDTO data) {
        if (data.street() != null) {
            this.street = data.street();
        }
        if (data.complement() != null) {
            this.complement = data.complement();
        }

        if (data.addressNumber() != 0) {
            this.addressNumber = data.addressNumber();
        }
        if (data.neighborhood() != null) {
            this.neighborhood = data.neighborhood();
        }
        if (data.city() != null) {
            this.city = data.city();
        }
        if (data.state() != null) {
            this.state = data.state();
        }
        if (data.zipCode() != null) {
            this.zipCode = data.zipCode();
        }
    }
}

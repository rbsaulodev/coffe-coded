package br.com.alura.api.model.mapper;

import br.com.alura.api.model.Doctor;
import br.com.alura.api.model.dto.DoctorDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {AddressMapper.class})
public interface DoctorMapper {
    Doctor toEntity(DoctorDTO dto);
    DoctorDTO toDTO(Doctor doctor);
}
package br.com.alura.api.model.mapper;

import br.com.alura.api.model.Address;
import br.com.alura.api.model.dto.AddressDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface AddressMapper {

    AddressMapper INSTANCE = Mappers.getMapper(AddressMapper.class);

    Address toEntity(AddressDTO dto);
    AddressDTO toDTO(Address address);
}

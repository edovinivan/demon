package ru.example.nothome.demon.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface GarmentMapper {
    ru.example.nothome.demon.model.xml.entity.GarmentXml mapEntityToXml(ru.example.nothome.demon.model.entity.Garment garment);
    ru.example.nothome.demon.model.entity.Garment mapXmlToEntity(ru.example.nothome.demon.model.xml.entity.GarmentXml garment);
    ru.example.nothome.demon.model.dto.GarmentDto mapEntityToDto(ru.example.nothome.demon.model.entity.Garment garmentDto);
    ru.example.nothome.demon.model.entity.Garment mapDtoToEntity(ru.example.nothome.demon.model.dto.GarmentDto garment);
}

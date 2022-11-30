package ru.example.nothome.demon.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;
import ru.example.nothome.demon.model.dto.GarmentDto;
import ru.example.nothome.demon.model.entity.Garment;
import ru.example.nothome.demon.model.xml.entity.GarmentXml;

import java.util.List;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface GarmentMapper {
    GarmentXml mapEntityToXml(Garment garment);
    Garment mapXmlToEntity(GarmentXml garment);
    GarmentDto mapEntityToDto(Garment garmentDto);
    Garment mapDtoToEntity(GarmentDto garment);
    List<Garment> mapXmlToEntity(List<GarmentXml> garment);
}

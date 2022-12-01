package ru.example.nothome.demon.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;
import ru.example.nothome.demon.model.dto.GarmentDto;
import ru.example.nothome.demon.model.entity.Garment;
import ru.example.nothome.demon.model.entity.Material;
import ru.example.nothome.demon.model.xml.entity.GarmentXml;
import ru.example.nothome.demon.model.xml.entity.MaterialXml;
import ru.example.nothome.demon.model.xml.entity.MaterialsXml;
import java.util.Arrays;

import java.util.List;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface GarmentMapper {
    GarmentXml mapEntityToXml(Garment garment);
    @Mapping(target = "material", expression = "java(map(garment.getMaterials().getMaterialXml()))")
    Garment mapXmlToEntity(GarmentXml garment);
    GarmentDto mapEntityToDto(Garment garmentDto);
    Garment mapDtoToEntity(GarmentDto garment);
    List<Garment> mapXmlToEntity(List<GarmentXml> garment);

    Material map(MaterialXml materialXml);

    List<Material> map(List<MaterialXml> materialXmls);


}

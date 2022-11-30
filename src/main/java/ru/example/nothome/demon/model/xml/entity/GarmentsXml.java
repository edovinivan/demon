package ru.example.nothome.demon.model.xml.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@Data
@XmlRootElement(name = "Garments")
@XmlAccessorType(XmlAccessType.FIELD)
public class GarmentsXml {
    @XmlElement(name = "Garment")
    private List<GarmentXml> garmentXml;
}

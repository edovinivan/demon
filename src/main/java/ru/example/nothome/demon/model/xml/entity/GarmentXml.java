package ru.example.nothome.demon.model.xml.entity;

import lombok.Data;
import ru.example.nothome.demon.model.entity.Material;

import javax.xml.bind.annotation.*;
import java.util.List;

@Data
@XmlRootElement(name = "Garment")
@XmlAccessorType(XmlAccessType.FIELD)
public class GarmentXml {
    @XmlAttribute
    private String Article;
    @XmlAttribute
    private String name;

    @XmlElement(name = "textsite")
    private String textsite;

    @XmlElement(name = "materials")
    MaterialsXml materials;

}

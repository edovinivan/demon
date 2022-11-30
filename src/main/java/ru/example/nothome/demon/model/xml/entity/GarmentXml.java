package ru.example.nothome.demon.model.xml.entity;

import lombok.Data;

import javax.xml.bind.annotation.*;

@Data
@XmlRootElement(name = "Garment")
@XmlAccessorType(XmlAccessType.FIELD)
public class GarmentXml {
    @XmlAttribute
    private String article;
    @XmlAttribute
    private String name;

    @XmlElement(name = "textsite")
    private String textsite;

}

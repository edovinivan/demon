package ru.example.nothome.demon.model.xml.entity;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;

@Data
@XmlRootElement(name = "material")
@XmlAccessorType(XmlAccessType.FIELD)
public class MaterialXml {
    @XmlAttribute(name = "color_name")
    private String color;

    @XmlAttribute(name = "qty")
    private BigDecimal qty;

}

package ru.example.nothome.demon.model.xml.entity;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@Data
@XmlRootElement(name = "operations")
@XmlAccessorType(XmlAccessType.FIELD)
public class OperationsXml {
    @XmlElement(name = "operation")
    private List<OperationXml> operationXml;
}

package ru.example.nothome.demon.service;

import ru.example.nothome.demon.model.entity.Garment;
import ru.example.nothome.demon.model.xml.entity.GarmentsXml;

import java.util.List;

public interface GarmentXmlService {
    List<Garment> list();
    List<Garment> loadXmlGarments(GarmentsXml garmentsXml);
}

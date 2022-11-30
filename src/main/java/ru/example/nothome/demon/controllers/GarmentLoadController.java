package ru.example.nothome.demon.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.example.nothome.demon.mapper.GarmentMapper;
import ru.example.nothome.demon.model.dto.GarmentDto;
import ru.example.nothome.demon.model.entity.Garment;
import ru.example.nothome.demon.model.xml.entity.GarmentXml;
import ru.example.nothome.demon.model.xml.entity.GarmentsXml;
import ru.example.nothome.demon.service.GarmentXmlService;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("modelload")
@RequiredArgsConstructor
public class GarmentLoadController {



    private final GarmentXmlService garmentXmlService;


    @GetMapping("/load")
    public String load(){


        return "OK";
    }

    @GetMapping("/loads")
    public String loads(){

        garmentXmlService.list();
        return "OK";
    }

    @GetMapping("/save")
    public String save(){

        return "OK1";
    }






}

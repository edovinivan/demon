package ru.example.nothome.demon.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
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
@Slf4j
public class GarmentLoadController {



    private final GarmentXmlService garmentXmlService;


    @GetMapping("/load")
    public String load(){


        return "OK";
    }

    @GetMapping("/loads")
    public ResponseEntity<String> loads(){
        log.info("Старт загрузки");
        String responsText = "Загруженно " +  garmentXmlService.list().size() + " записей!";
        log.info("Конец загрузки");
        return ResponseEntity.ok(responsText);
    }

    @GetMapping("/save")
    public String save(){

        return "OK1";
    }


    @PostMapping("/load-list-xml")
    public ResponseEntity loadlist(@RequestBody @Validated GarmentsXml garmentsXml){
        List<Garment> garments = garmentXmlService.loadXmlGarments(garmentsXml);
        return ResponseEntity.ok("Save " + garments.size() + " object!");
    }




}

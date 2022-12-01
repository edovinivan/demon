package ru.example.nothome.demon.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.example.nothome.demon.mapper.GarmentMapper;
import ru.example.nothome.demon.model.entity.Garment;
import ru.example.nothome.demon.model.entity.Material;
import ru.example.nothome.demon.model.xml.entity.GarmentsXml;
import ru.example.nothome.demon.repository.GarmentRepository;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class GarmentXmlServiceImpl implements GarmentXmlService{

    private final GarmentMapper garmentMapper;

    private final GarmentDbService garmentDbService;

    @Override
    public List<Garment> loadXmlGarments(GarmentsXml garmentsXml) {
        log.info("Convert xmlObject to Entity");
        List<Garment> garmentList = garmentMapper.mapXmlToEntity(garmentsXml.getGarmentXml());
        if(!garmentList.isEmpty()){
            garmentList.forEach(it ->{
                System.out.println(it);
                /*Garment garment = garmentDbService.getByArticle(it.getArticle());
                if(garment != null){
                    it.setId(garment.getId());
                }*/
                /*Material mat = new Material();
                mat.setColor("dfdsfds");
                mat.setQty(new BigDecimal(123));
                it.setMaterial(Arrays.asList(mat));*/
                it = garmentDbService.save(it);
            });

        }
        return garmentList;
    }
}

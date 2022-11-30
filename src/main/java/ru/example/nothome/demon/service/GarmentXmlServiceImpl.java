package ru.example.nothome.demon.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.example.nothome.demon.mapper.GarmentMapper;
import ru.example.nothome.demon.model.entity.Garment;
import ru.example.nothome.demon.model.xml.entity.GarmentsXml;
import ru.example.nothome.demon.repository.GarmentRepository;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class GarmentXmlServiceImpl implements GarmentXmlService{

    private final GarmentMapper garmentMapper;

    private final GarmentDbService garmentDbService;

    @Override
    public List<Garment> list() {
        List<Garment> garmentList = new ArrayList<>();
        JAXBContext context = null;
        try {
            context = JAXBContext.newInstance(GarmentsXml.class);
            GarmentsXml ls = (GarmentsXml) context.createUnmarshaller().unmarshal(new FileReader("C:\\Users\\edovin.ivan\\Downloads\\123.xml", Charset.forName("UTF-8")));

            garmentList = garmentMapper.mapXmlToEntity(ls.getGarmentXml());

//            List<Garment> garments = garmentRepository.saveAll(garmentList.stream()
//                    .filter(t1 -> !t1.getTextsite().isEmpty() && t1.getTextsite().trim().length()>2)
//                    .collect(Collectors.toList())
//            );

        } catch (JAXBException | FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return garmentList;
    }

    @Override
    public List<Garment> loadXmlGarments(GarmentsXml garmentsXml) {
        log.info("Convert xmlObject to Entity");
        List<Garment> garmentList = garmentMapper.mapXmlToEntity(garmentsXml.getGarmentXml());
        if(!garmentList.isEmpty()){
            garmentList.forEach(it ->{
                Garment garment = garmentDbService.getByArticle(it.getArticle());
                if(garment != null){
                    it.setId(garment.getId());
                }
                it = garmentDbService.save(it);
            });

        }
        return garmentList;
    }
}

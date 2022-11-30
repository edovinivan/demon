package ru.example.nothome.demon.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.example.nothome.demon.mapper.GarmentMapper;
import ru.example.nothome.demon.model.entity.Garment;
import ru.example.nothome.demon.model.xml.entity.GarmentsXml;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class GarmentXmlServiceImpl implements GarmentXmlService{

    private final GarmentMapper garmentMapper;

    @Override
    public List<Garment> list() {
        List<Garment> garmentList = new ArrayList<>();
        JAXBContext context = null;
        try {
            context = JAXBContext.newInstance(GarmentsXml.class);
            GarmentsXml ls = (GarmentsXml) context.createUnmarshaller().unmarshal(new FileReader("C:\\Users\\edovin.ivan\\Downloads\\123.xml", Charset.forName("UTF-8")));

            ls.getGarmentXml().forEach(it-> {
                garmentList.add(garmentMapper.mapXmlToEntity(it));
            });

            System.out.println(garmentList.size());

        } catch (JAXBException | FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return garmentList;
    }
}

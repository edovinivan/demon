package ru.example.nothome.demon.listeners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import ru.example.nothome.demon.model.entity.Garment;
import ru.example.nothome.demon.repository.GarmentRepository;

import javax.persistence.*;

@Component
public class GarmentListener {
    @Autowired
    private static GarmentRepository garmentRepository;

    @Autowired
    public void setGarmentRepository(GarmentRepository garmentRepository) {
        GarmentListener.garmentRepository = garmentRepository;
    }

    @PostPersist
    private void testListener1(Garment garment){
        Long l = 1l;
    }

    @PrePersist
    private void testListener4(Garment garment){
        //garment.setVersion(garment.getVersion() == null? 0L: garment.getVersion());
    }

    @PreRemove
    private void testListener2(Garment garment){
        Long l = 2l;
    }

    @PostLoad
    private void testListener3(Garment garment){
        garmentRepository.saveAndFlush(garment);
    }
}

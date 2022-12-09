package ru.example.nothome.demon.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.example.nothome.demon.model.entity.Garment;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GarmentServiceImpl implements GarmentService{

    private final GarmentDbService garmentDbService;

    @Override
    public Optional<Garment> getById(Long id){
        return garmentDbService.getById(id);
    }

    @Override
    public List<Garment> getAllList() {
        return garmentDbService.getAllList();
    }
}

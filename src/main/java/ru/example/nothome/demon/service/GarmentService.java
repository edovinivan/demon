package ru.example.nothome.demon.service;

import ru.example.nothome.demon.model.entity.Garment;

import java.util.List;

public interface GarmentService {
    Garment getById(Long id);
    List<Garment> getAllList();
}

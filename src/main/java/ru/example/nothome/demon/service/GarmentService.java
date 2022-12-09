package ru.example.nothome.demon.service;

import ru.example.nothome.demon.model.entity.Garment;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public interface GarmentService {
    Optional<Garment> getById(Long id);
    List<Garment> getAllList();
}

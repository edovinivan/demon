package ru.example.nothome.demon.service;

import ru.example.nothome.demon.model.entity.Garment;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public interface GarmentDbService{
    Garment save(Garment garment);
    Optional<Garment> getById(Long id);
    Garment getByArticle(String article);
    List<Garment> savaAll(List<Garment> garmentList);

    void delete(Long d);

    List<Garment> getAllList();




}

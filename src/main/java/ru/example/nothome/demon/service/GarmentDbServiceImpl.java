package ru.example.nothome.demon.service;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import ru.example.nothome.demon.model.entity.Garment;
import ru.example.nothome.demon.repository.GarmentRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class GarmentDbServiceImpl implements GarmentDbService{

    private final GarmentRepository garmentRepository;

    @Override
    public Garment save(Garment garment) {
        Garment save = garmentRepository.save(garment);
        return save;
    }

    @Override
    public Garment getById(Long id) {
        return garmentRepository.findById(id).get();
    }

    @Override
    public Garment getByArticle(String article) {
        List<Garment> allByArticle = garmentRepository.findAllByArticle(article);
        if(allByArticle.isEmpty())
            return null;
        return allByArticle.get(0);
    }

    @Override
    public List<Garment> savaAll(List<Garment> garmentList) {
        return garmentRepository.saveAll(garmentList);
    }

    @Override
    public void delete(Long d) {
        garmentRepository.deleteById(d);
    }
}

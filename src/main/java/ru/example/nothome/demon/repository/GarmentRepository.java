package ru.example.nothome.demon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.example.nothome.demon.model.entity.Garment;

@Repository
public interface GarmentRepository extends JpaRepository<Garment, Long> {
}

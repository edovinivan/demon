package ru.example.nothome.demon.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.example.nothome.demon.model.entity.Garment;
import ru.example.nothome.demon.service.GarmentService;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/garment")
@RequiredArgsConstructor
public class GarmentController {

    private final GarmentService garmentService;

    @PostMapping(value = "/get-by-id", produces = "application/json")
    public @ResponseBody ResponseEntity<Garment> getById(@RequestParam(value = "id") @Validated Long id){
        Optional<Garment> garment = garmentService.getById(id);
        return ResponseEntity.of(garment);
    }

    @GetMapping(value = "/get-all-list", produces = "application/json")
    public @ResponseBody ResponseEntity<List<Garment>> getAllList(){
        return ResponseEntity.ok(garmentService.getAllList());
    }



}

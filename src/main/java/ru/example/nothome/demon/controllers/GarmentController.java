package ru.example.nothome.demon.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.example.nothome.demon.model.entity.Garment;
import ru.example.nothome.demon.service.GarmentService;

import java.util.List;

@RestController
@RequestMapping("/garment")
@RequiredArgsConstructor
public class GarmentController {

    private final GarmentService garmentService;

    @GetMapping("/get-by-id")
    public String getById(@RequestBody @Validated Long id){
        return "list";
    }

    @GetMapping("/get-all-list")
    public @ResponseBody ResponseEntity<List<Garment>> getAllList(){
        return ResponseEntity.ok(garmentService.getAllList());
    }



}

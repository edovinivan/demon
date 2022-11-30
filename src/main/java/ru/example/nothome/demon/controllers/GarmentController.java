package ru.example.nothome.demon.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/model")
public class GarmentController {

    @GetMapping("/list")
    public String list(){
        return "list";
    }


}

package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ClimaService;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class Controller{
    
    private final ClimaService service;

    public Controller(ClimaService service) {
        this.service = service;
    }

    @GetMapping("/clima")
    public String preverTempo(){
        return service.preverTempo();
    }
}
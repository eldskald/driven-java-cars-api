package com.cars.api.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cars.api.dto.CarDTO;

@RestController
@RequestMapping("/api")
public class ApiController {

    @PostMapping
    public void create(@RequestBody CarDTO body) {
        System.out.println("Modelo: " + body.modelo());
        System.out.println("Fabricante: " + body.fabricante());
        System.out.println("Data de fabricação: " + body.dataFabricacao());
        System.out.println("Valor: " + body.valor());
        System.out.println("Ano Modelo: " + body.anoModelo());
    }
}
 
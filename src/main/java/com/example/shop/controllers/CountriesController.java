package com.example.shop.controllers;

import com.example.shop.entities.Countries;
import com.example.shop.services.CountriesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountriesController {

    private final CountriesService countriesService;

    public CountriesController(CountriesService countriesService) {
        this.countriesService = countriesService;
    }

    @GetMapping
    public List<Countries> getAllCountries() {
        return countriesService.getAllCountries();
    }
}
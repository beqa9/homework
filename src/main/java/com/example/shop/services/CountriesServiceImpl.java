package com.example.shop.services;

import com.example.shop.entities.Countries;
import com.example.shop.repositories.CountriesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountriesServiceImpl implements CountriesService {
    private final CountriesRepository countriesRepository;

    public CountriesServiceImpl(CountriesRepository countriesRepository) {
        this.countriesRepository = countriesRepository;
    }

    @Override
    public List<Countries> getAllCountries() {
        return countriesRepository.findAll();
    }
}
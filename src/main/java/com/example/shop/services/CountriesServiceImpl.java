package com.example.shop.services;

import com.example.shop.entities.Country;
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
    public List<Country> getAllCountries() {
        return countriesRepository.findAll();
    }
}
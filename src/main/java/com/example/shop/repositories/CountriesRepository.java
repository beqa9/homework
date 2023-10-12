package com.example.shop.repositories;

import com.example.shop.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CountriesRepository extends JpaRepository<Country,Integer> {
    List<Country> findAll();
}

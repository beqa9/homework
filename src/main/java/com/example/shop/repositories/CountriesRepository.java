package com.example.shop.repositories;

import com.example.shop.entities.Companies;
import com.example.shop.entities.Countries;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CountriesRepository extends JpaRepository<Countries,Integer> {
    List<Countries> findAll();
}

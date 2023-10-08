package com.example.shop.repositories;

import com.example.shop.entities.Companies;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompaniesRepository extends JpaRepository<Companies,Integer> {
    List<Companies> findAll();
    List<Companies> findByNameStartingWithIgnoreCase(String name);
    Companies saveAndFlush(Companies company);

}

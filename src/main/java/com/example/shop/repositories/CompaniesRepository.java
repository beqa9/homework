package com.example.shop.repositories;

import com.example.shop.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompaniesRepository extends JpaRepository<Company,Integer> {
    List<Company> findAll();
    List<Company> findByNameStartingWithIgnoreCase(String name);
    Company saveAndFlush(Company company);

}

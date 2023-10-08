package com.example.shop.repositories;

import com.example.shop.entities.Companies;
import com.example.shop.entities.Products;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductsRepository extends JpaRepository<Products,Integer> {
    List<Products> findAll();
    List<Products> findByNameStartingWithIgnoreCase(String name);
}

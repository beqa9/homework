package com.example.shop.repositories;

import com.example.shop.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductsRepository extends JpaRepository<Product,Integer> {
    List<Product> findAll();
    List<Product> findByNameStartingWithIgnoreCase(String name);
    Product saveAndFlush(Product products);
}

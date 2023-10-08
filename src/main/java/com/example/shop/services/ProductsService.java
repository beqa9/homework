package com.example.shop.services;

import com.example.shop.entities.Companies;
import com.example.shop.entities.Products;

import java.util.List;

public interface ProductsService {
    List<Products> getAllProducts();
    List<Products> searchProductsByName(String name);
}

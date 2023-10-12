package com.example.shop.services;

import com.example.shop.entities.Product;

import java.util.List;

public interface ProductsService {
    List<Product> getAllProducts();
    List<Product> searchProductsByName(String name);
    Product addProduct(Product products);
}

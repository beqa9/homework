package com.example.shop.services;

import com.example.shop.entities.Companies;
import com.example.shop.entities.Products;
import com.example.shop.repositories.ProductsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductsServiceImpl implements ProductsService{
    private final ProductsRepository productsRepository;

    public ProductsServiceImpl(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    @Override
    public List<Products> getAllProducts() {
        return productsRepository.findAll();
    }
    @Override
    public List<Products> searchProductsByName(String name) {
        return productsRepository.findByNameStartingWithIgnoreCase(name);
    }
}

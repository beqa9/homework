package com.example.shop.controllers;

import com.example.shop.entities.Companies;
import com.example.shop.entities.Products;
import com.example.shop.services.ProductsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/products")
public class ProductsController{

    private final ProductsService productsService;

    public ProductsController(ProductsService productsService) {
        this.productsService = productsService;
    }

    @GetMapping
    public List<Products> getAllProducts() {
        return productsService.getAllProducts();
    }
    @GetMapping("/{name}")
    public List<Products> searchProductsByName(@PathVariable String name) {
        return productsService.searchProductsByName(name);
    }
}

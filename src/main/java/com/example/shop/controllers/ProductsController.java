package com.example.shop.controllers;

import com.example.shop.entities.Product;
import com.example.shop.services.ProductsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/products")
public class ProductsController{

    private final ProductsService productsService;

    public ProductsController(ProductsService productsService) {
        this.productsService = productsService;
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productsService.getAllProducts();
    }
    @GetMapping("/{name}")
    public List<Product> searchProductsByName(@PathVariable String name) {
        return productsService.searchProductsByName(name);
    }
    @PostMapping
    public Product addCompany(@RequestBody Product products) {
        return productsService.addProduct(products);
    }
}

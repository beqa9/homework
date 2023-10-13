package com.example.shop.controllers;

import com.example.shop.entities.Company;
import com.example.shop.entities.Product;
import com.example.shop.models.CompanyModel;
import com.example.shop.models.ProductModel;
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
    @PostMapping("/{id}")
    public Product addProduct(@PathVariable Integer id, @RequestBody ProductModel productModel) {
        return productsService.addProduct(id,productModel);
    }
}

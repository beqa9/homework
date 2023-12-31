package com.example.shop.services;

import com.example.shop.entities.Product;
import com.example.shop.models.ProductModel;
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
    public List<Product> getAllProducts() {
        return productsRepository.findAll();
    }
    @Override
    public List<Product> searchProductsByName(String name) {
        return productsRepository.findByNameStartingWithIgnoreCase(name);
    }

    @Override
    public Product addProduct(Product product) {
        return productsRepository.save(product);
    }

    @Override
    public Product addProduct(Integer id, ProductModel productModel) {
        Product product = new Product();
        product.setId(id);
        product.setEan(productModel.ean());
        product.setName(productModel.name());
        product.setCompanyID(productModel.companyID());
        product.setCountryID(productModel.countryID());
        productsRepository.save(product);
        return product;
    }
}

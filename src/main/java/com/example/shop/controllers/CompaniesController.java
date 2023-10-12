package com.example.shop.controllers;

import com.example.shop.entities.Company;
import com.example.shop.models.CompanyModel;
import com.example.shop.services.CompaniesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/companies")
public class CompaniesController {

    private final CompaniesService companiesService;

    public CompaniesController(CompaniesService companiesService) {
        this.companiesService = companiesService;
    }

    @GetMapping
    public List<Company> getAllCompanies() {
        return companiesService.getAllCompanies();
    }

    @GetMapping("/{name}")
    public List<Company> searchCompaniesByName(@PathVariable String name) {
        return companiesService.searchCompaniesByName(name);
    }
    @PostMapping("/{id}")
    public Company addCompany(@PathVariable Integer id,@RequestBody CompanyModel companyModel) {
        return companiesService.addCompany(id,companyModel);
    }
}

package com.example.shop.controllers;

import com.example.shop.entities.Companies;
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
    public List<Companies> getAllCompanies() {
        return companiesService.getAllCompanies();
    }

    @GetMapping("/{name}")
    public List<Companies> searchCompaniesByName(@PathVariable String name) {
        return companiesService.searchCompaniesByName(name);
    }
    @PostMapping
    public Companies addCompany(@RequestBody Companies company) {
        return companiesService.addCompany(company);
    }
}

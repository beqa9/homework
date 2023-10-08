package com.example.shop.services;

import com.example.shop.entities.Companies;
import com.example.shop.repositories.CompaniesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompaniesServiceImpl implements CompaniesService{
    private final CompaniesRepository companiesRepository;

    public CompaniesServiceImpl(CompaniesRepository companiesRepository){
        this.companiesRepository = companiesRepository;
    }

    @Override
    public List<Companies> getAllCompanies() {
        return companiesRepository.findAll();
    }
    @Override
    public List<Companies> searchCompaniesByName(String name) {
        return companiesRepository.findByNameStartingWithIgnoreCase(name);
    }
    @Override
    public Companies addCompany(Companies company) {
        return companiesRepository.saveAndFlush(company);
    }
}

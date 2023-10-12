package com.example.shop.services;

import com.example.shop.entities.Company;
import com.example.shop.models.CompanyModel;
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
    public List<Company> getAllCompanies() {
        return companiesRepository.findAll();
    }
    @Override
    public List<Company> searchCompaniesByName(String name) {
        return companiesRepository.findByNameStartingWithIgnoreCase(name);
    }

    @Override
    public Company addCompany(Company company) {
        return companiesRepository.save(company);
    }

    @Override
    public Company addCompany(Integer id, CompanyModel companyModel) {
        Company company = new Company();
        company.setId(id);
        company.setParentId(companyModel.parentId());
        company.setCountryId(companyModel.countryId());
        company.setName(companyModel.name());
        company.setNameGeo(companyModel.nameGeo());
        companiesRepository.save(company);
        return company;
    }
}

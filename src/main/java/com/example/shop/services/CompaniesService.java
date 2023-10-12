package com.example.shop.services;

import com.example.shop.entities.Company;
import com.example.shop.models.CompanyModel;

import java.util.List;

public interface CompaniesService {
    List<Company> getAllCompanies();
    List<Company> searchCompaniesByName(String name);
    Company addCompany(Company company);

    Company addCompany(Integer id, CompanyModel companyModel);
}

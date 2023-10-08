package com.example.shop.services;

import com.example.shop.entities.Companies;

import java.util.List;

public interface CompaniesService {
    List<Companies> getAllCompanies();
    List<Companies> searchCompaniesByName(String name);
    Companies addCompany(Companies company);

}

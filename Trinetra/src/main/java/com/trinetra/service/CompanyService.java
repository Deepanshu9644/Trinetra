package com.trinetra.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trinetra.dao.CompanyRepository;
import com.trinetra.entity.Company;

@Service
public class CompanyService {
    @Autowired
    private CompanyRepository companyRepository;

    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    public Company saveCompany(Company company) {
        return companyRepository.save(company);
    }

    

    public void deleteCompany(Long id) {
        companyRepository.deleteById(id);
    }

    

    
}


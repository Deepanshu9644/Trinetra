package com.trinetra.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trinetra.entity.Company;
import com.trinetra.service.CompanyService;

@RestController

@RequestMapping("/companies")
public class CompanyController {
	
    @Autowired
    private CompanyService companyService;
    
    @GetMapping("/c")
    public List<Company> getAllCompanies() {
        return companyService.getAllCompanies();
    }
    
    @PostMapping
    public Company createCompany(@RequestBody Company company) {
        return companyService.saveCompany(company);
    }
    @DeleteMapping("/{id}")
    public void deleteCompany(@PathVariable Long id) {
        companyService.deleteCompany(id);
    }
}

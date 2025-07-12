package com.trinetra.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trinetra.dao.CenterRepository;
import com.trinetra.entity.Center;

@Service
public class CenterService {
    @Autowired
    private CenterRepository companyRepository;

    public List<Center> getAllCompanies() {
        return companyRepository.findAll();
    }

    public Center saveCenter(Center center) {
        return companyRepository.save(center);
    }

   

    public void deleteCenter(Long id) {
        companyRepository.deleteById(id);
    }
    
    public void DeleteName(String name){
        companyRepository.deleteByName(name);
    }
}


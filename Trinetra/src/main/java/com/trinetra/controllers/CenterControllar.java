package com.trinetra.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trinetra.entity.Center;
import com.trinetra.service.CenterService;

@RestController
@RequestMapping("/centers")
public class CenterControllar {
    @Autowired
    private CenterService companyService;

    @GetMapping("/c")
    public List<Center> getAllCompanies() {
        return companyService.getAllCompanies();
    }

    @PostMapping
    public ResponseEntity<Center> addCenter(@RequestBody Center center) {
        Center savedCenter = companyService.saveCenter(center) ;
        return ResponseEntity.status(HttpStatus.CREATED).body(savedCenter);
    }
    @DeleteMapping("/id/{id}")
    public void deleteCompany(@PathVariable Long id) {
        companyService.deleteCenter(id);
    }
    @DeleteMapping("/name/{name}")
    public void DeleteName(@PathVariable String name){
         companyService.DeleteName(name);       
    }
}

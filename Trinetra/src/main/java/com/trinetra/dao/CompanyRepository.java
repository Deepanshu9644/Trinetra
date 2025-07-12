package com.trinetra.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trinetra.entity.Company;
public interface CompanyRepository extends JpaRepository<Company, Long> {

}

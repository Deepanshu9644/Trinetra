package com.trinetra.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.trinetra.entity.Center;


  @Repository
public interface CenterRepository extends JpaRepository<Center, Long> {
  
    public void deleteByName(String name);
}


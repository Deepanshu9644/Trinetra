package com.trinetra.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.trinetra.entity.Employee;

@Repository
public interface EmployeesRepo extends JpaRepository<Employee, Long> {

}

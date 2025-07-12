package com.trinetra.service;

import com.trinetra.dao.EmployeesRepo;
import com.trinetra.entity.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeesRepo employeeRepository;

    public Employee saveEmployee(Employee employe) {
        return employeeRepository.save(employe);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public void deleteEmployeById(Long id) {
        Employee employee = employeeRepository.findById(id)
       .orElseThrow(() -> new IllegalArgumentException("Employee not found with name: " + id));
        employeeRepository.delete(employee);
    }
}

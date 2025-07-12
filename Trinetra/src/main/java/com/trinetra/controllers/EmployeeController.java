package com.trinetra.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import com.trinetra.entity.Company;
import com.trinetra.entity.Employee;
import com.trinetra.service.CompanyService;
import com.trinetra.service.EmployeeService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping("/employes")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // Add a new Employee
    @PostMapping
    public ResponseEntity<String> addEmploye(@RequestBody Employee employee) {
        try {
            employeeService.saveEmployee(employee);
            return ResponseEntity.ok("Employee added successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error occurred");
        }
    }
    
    @PostMapping("/add")
    public ResponseEntity<String> addEmployee(@ModelAttribute Employee employee) {
        employee.setStatus("Active");
        try {
            employeeService.saveEmployee(employee);
            return ResponseEntity.ok("Employee added successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error occurred");
        }
    }

    // Get all Employees
    @GetMapping("/emp")
    public ResponseEntity<List<Employee>> getAllEmployees() {
        List<Employee> employees = employeeService.getAllEmployees();
        return ResponseEntity.ok(employees);
    }

    // Delete a Employee by name
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEmploye(@PathVariable Long id) {
        try {
        	employeeService.deleteEmployeById(id);
            return ResponseEntity.ok("Employee Deleted successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error occurred");
        }
    }
}

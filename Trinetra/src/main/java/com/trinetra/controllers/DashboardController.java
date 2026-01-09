package com.trinetra.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.trinetra.dao.CompanyRepository;
import com.trinetra.dao.EmployeesRepo;
import com.trinetra.dao.IpcRepository;
import com.trinetra.entity.Company;
import com.trinetra.entity.Employee;
import com.trinetra.entity.Ipc;

import org.springframework.ui.Model;

@Controller
public class DashboardController {
	
	@Autowired
	private EmployeesRepo employeeRepository;

	@Autowired
	private CompanyRepository companyRepository;

	@Autowired
	private IpcRepository ipcRepository;
	



	@GetMapping("/dashboard")
	public String getDashboard(Model model) {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
	    String role = authentication.getAuthorities().iterator().next().getAuthority();

	    List<Employee> employees = employeeRepository.findAll();
	    List<Company> companies = companyRepository.findAll();
	    List<Ipc> ipcs = ipcRepository.findAll();

	    model.addAttribute("employees", employees);
	    model.addAttribute("companies", companies);
	    model.addAttribute("ipcs", ipcs);
	    
	    return "Dashboard";
	    

	}



}


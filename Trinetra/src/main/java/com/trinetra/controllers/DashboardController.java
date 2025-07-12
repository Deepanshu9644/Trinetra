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
	
//	@GetMapping("/dashboard")
//	public String sharedDashboard() {
//	    return "Dashboard"; // refers to Dashboard.html in templates
//	}
	


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
	    
//	    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//	    for (GrantedAuthority authority : authentication.getAuthorities()) {
//	        String role = authority.getAuthority();
//	        if (role.equals("ROLE_ADMIN")) {
//	            model.addAttribute("employees", employeeRepository.findAll());
//	            model.addAttribute("companies", companyRepository.findAll());
//	            model.addAttribute("ipcs", ipcRepository.findAll());
//	            return "admin_dashboard";
//	        } else if (role.equals("ROLE_MANAGER")) {
//	            // You can customize the data shown to managers if needed
//	            model.addAttribute("employees", employeeRepository.findAll());
//	            model.addAttribute("companies", companyRepository.findAll());
//	            model.addAttribute("ipcs", ipcRepository.findAll());
//	            return "manager_dashboard";
//	        }
//	    }
//	    return "access_denied";
	}


//    @GetMapping("/dashboard")
//    public String getDashboard() {
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        for (GrantedAuthority authority : authentication.getAuthorities()) {
//            String role = authority.getAuthority();
//            if (role.equals("ROLE_ADMIN")) {
//                return "redirect:/admin/dashboard";
//            } else if (role.equals("ROLE_MANAGER")) {
//                return "redirect:/manager/dashboard";
//            }
//        }
//        return "access_denied"; // fallback if role doesn't match
//    }
//
//    @GetMapping("/admin/dashboard")
//    public String adminDashboard() {
//        return "admin_dashboard";
//    }
//
//    @GetMapping("/manager/dashboard")
//    public String managerDashboard() {
//        return "manager_dashboard";
//    }
//
//    @GetMapping("/access-denied")
//    public String accessDenied() {
//        return "access_denied";
//    }
}


package com.employee.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.ems.model.Employee;
import com.employee.ems.repository.EmployeeRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

@RequestMapping("/api/v1")
public class EmployeeController {
		
	@Autowired
	private EmployeeRepository employeeRepo;
	
	
	// get all employee
	@GetMapping("/employees")
	public List<Employee> getAllEmployee(){
		return employeeRepo.findAll();
	}
}

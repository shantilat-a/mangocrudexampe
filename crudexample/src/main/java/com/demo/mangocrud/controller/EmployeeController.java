package com.demo.mangocrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.mangocrud.model.Employee;
import com.demo.mangocrud.repo.EmployeeRepo;

@RestController
@RequestMapping("/allapi")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepo empRepo;
	@RequestMapping("/create")
	public Employee createEmployee(@RequestBody Employee employee) { 
		return empRepo.save(employee);
		
		
	}
	@RequestMapping("/getAll")
	public List<Employee> getAllEmployee() {
		return empRepo.findAll();
		
	}
	@RequestMapping("/delete")
	public String getAllEmployee(@RequestBody Employee employee) {
		empRepo.delete(employee);
		return "deleted successfully";
		
		
	}
	@RequestMapping("/update")
	public Employee updateEmployee(@RequestBody Employee employee) {
		Employee emp = empRepo.save(employee);
		if(emp!=null) {
			emp.setDesignation(emp.getDesignation());
			emp.setDesignation(emp.getName());
		
			
		}
		return emp;
		
		
	
		
		
	}
}

package com.example.demo.controller;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Services.EmployeeService;
import com.example.demo.entitys.Employee;

@RestController
public class Controller {
	@Autowired
	EmployeeService employeeService;

	@PostMapping("/employee")
	public String addEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}

	@PutMapping("/update")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);

	}

	@GetMapping("/get")
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}

	@GetMapping("/get/{id}")
	public Employee getEmployee(int empId) {
		return employeeService.getEmployee(empId);
	}

	@DeleteMapping("/delete")
	public void deletEmployee(int empId) {
	}
}

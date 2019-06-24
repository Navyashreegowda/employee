package com.example.demo.Services;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entitys.Employee;
import com.example.demo.repository.Repository;

public interface EmployeeService {
	
	
public String addEmployee(Employee employee);
public Employee updateEmployee(Employee employee);
public List<Employee> getAllEmployees();
public Employee getEmployee(int empId);
public void deletEmployee(int empId);

	

}

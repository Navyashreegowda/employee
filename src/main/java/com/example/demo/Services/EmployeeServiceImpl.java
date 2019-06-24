package com.example.demo.Services;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entitys.Employee;
import com.example.demo.repository.Repository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	Repository repository;

	@Override
	public String addEmployee(Employee employee) {

		if (repository.save(employee) == null)
			return "employee not created";
		else
			return employee.getEmpId() + "employee created successfully";

	}

	@Override
	public Employee updateEmployee(Employee employee) {

		return repository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {

		return repository.findAll();
	}

	@Override
	public Employee getEmployee(int empId)  {

		return repository.getOne(empId);
	}

	@Override
	public void deletEmployee(int empId)  {
		repository.deleteById(empId);

	}

}

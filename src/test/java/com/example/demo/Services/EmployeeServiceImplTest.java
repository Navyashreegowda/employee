package com.example.demo.Services;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.entitys.Employee;
import com.example.demo.repository.Repository;

@RunWith(SpringRunner.class)
public class EmployeeServiceImplTest {

	@Mock
	Repository repository;
	
	@InjectMocks
	EmployeeServiceImpl classUnderTest;
	
	Employee employee = new Employee();
	
	@Test
	public void addEmployeeForSuccess() {
		Mockito.when(repository.save(employee)).thenReturn(employee);
		classUnderTest.addEmployee(employee);
	}
}

package com.example.Abirami.service.impl;

import java.util.List;


import org.springframework.stereotype.Service;

import com.example.Abirami.entity.Employee;
import com.example.Abirami.repository.Employee_Repository;
import com.example.Abirami.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {


	private Employee_Repository employee_Repository;
	
	
	public EmployeeServiceImpl(Employee_Repository employee_Repository) {
		super();
		 this.employee_Repository = employee_Repository;
	}


	@Override
	public List<Employee> getAllEmployees() {
		
		return employee_Repository.findAll();
	}


//	@Override
//	public Object getAllEmployees() {
//		
//		return Employee_Repository.save(employee);
//	}


	@Override
	public Employee saveEmployee(Employee employee) {
		
		return employee_Repository.save(employee);
	}


	@Override
	public Employee getEmployeeById(Long id) {
		// TODO Auto-generated method stub
		return employee_Repository.findById(id).get();
	}


	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employee_Repository.save(employee);
	}


	@Override
	public void deleteEmployeeById(Long id) {
		// TODO Auto-generated method stub
		employee_Repository.deleteById(id);
		
	}
	
	

}

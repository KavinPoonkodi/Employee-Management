package com.example.Abirami;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Abirami.entity.Employee;
import com.example.Abirami.repository.Employee_Repository;

@SpringBootApplication
public class EmployeeManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementSystemApplication.class, args);
		System.out.println("hello world");
	}

	@Autowired
	private Employee_Repository employeeRepository;
	@Override
	public void run(String... args) throws Exception {
		

		
	}

}

package com.ganesh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ganesh.entity.Employee;
import com.ganesh.repository.AddressRepository;
import com.ganesh.repository.EmployeeRepository;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	AddressRepository addressRepository;

	@PostMapping("/save")
	public ResponseEntity<String> saveEmployees(@RequestBody Employee emp) {
		employeeRepository.save(emp);
		return ResponseEntity.ok("Save Data");
	}

	@GetMapping("/allEmp")
	public List<Employee>allEmp(){
		return employeeRepository.findAll();
	}
	
}

package com.codebuffer.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.codebuffer.entity.Department;
import com.codebuffer.service.DepartmentService;



@RestController
@RequestMapping("/departments")

public class DepartmentController {

	@Autowired
	DepartmentService depService;
	
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department) {
	System.out.println("entereddd");
		return depService.saveDepartment(department);
		 
	}
	
	@GetMapping("/{id}")
	public Optional<Department> findDepartment(@PathVariable("id") Long departmentId) {
		
		return depService.findDepartment(departmentId);
	}
	@GetMapping("/")
	public List<Department> findDepartments() {
		
		return depService.findDepartments();
	}
	
}

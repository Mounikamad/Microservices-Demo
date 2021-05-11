package com.codebuffer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codebuffer.entity.Department;
import com.codebuffer.repository.DepartmentRepo;

@Service
public class DepartmentService {
	
	@Autowired
	DepartmentRepo depRepo;
	
	public Department saveDepartment(Department department) {
		
		return depRepo.save(department);
	}

	public Optional<Department> findDepartment(Long departmentId) {
		return depRepo.findById(departmentId);
	}

	public List<Department> findDepartments() {
		// TODO Auto-generated method stub
		return  depRepo.findAll();
	}

}

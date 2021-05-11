package com.codebuffer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codebuffer.entity.Department;

public interface DepartmentRepo extends JpaRepository<Department, Long> {

}

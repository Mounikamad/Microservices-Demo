package com.codebuffer.vo;

import java.util.Optional;

import com.codebuffer.entity.User;

public class ResponseTemplateVO {
	
	private Department department;
	private Optional<User> user;
	

	public ResponseTemplateVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ResponseTemplateVO(Department department, Optional<User> user) {
		super();
		this.department = department;
		this.user = user;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Optional<User> getUser() {
		return user;
	}
	public void setUser(Optional<User> user2) {
		this.user = user2;
	}
	
	

}

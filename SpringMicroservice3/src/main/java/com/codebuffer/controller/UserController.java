package com.codebuffer.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codebuffer.entity.User;
import com.codebuffer.service.UserService;
import com.codebuffer.vo.ResponseTemplateVO;

@RestController

@RequestMapping("/users")
public class UserController {
	
@Autowired
UserService userservice;

@PostMapping("/")
public User addUser(@RequestBody User user) {
	return userservice.saveUser(user);	
}

@GetMapping("/{id}")
public Optional<ResponseTemplateVO> getUserwithDepartment(@PathVariable("id") Long id) {
	return userservice.getUserwithDepartment(id);
}

}
package com.codebuffer.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.codebuffer.entity.User;
import com.codebuffer.repository.UserRepository;
import com.codebuffer.vo.Department;
import com.codebuffer.vo.ResponseTemplateVO;

@Service
public class UserService {
	
	@Autowired
	RestTemplate restTemplate;
	@Autowired
	UserRepository userRepo;
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}
	
	public Optional<ResponseTemplateVO> getUserwithDepartment(Long id) {
		long userId=0;
		// TODO Auto-generated method stub
		ResponseTemplateVO vo = new ResponseTemplateVO();
		
		Optional<User> user= userRepo.findById(id);
		if(user.isPresent())
			userId = user.get().getDepartmentId();
			
		
		Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+userId, Department.class);
		vo.setUser(user);
		vo.setDepartment(department);
		return Optional.of(vo);
	}

}

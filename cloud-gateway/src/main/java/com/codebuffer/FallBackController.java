package com.codebuffer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {
	
	@GetMapping("/userServiceFallBack")
	public String userServiceFallBack() {
		return "User service not working ";
	}
	
	@GetMapping("/departmentServiceFallBack")
	public String departmentServiceFallBack() {
		return "department service not working ";
	}

}

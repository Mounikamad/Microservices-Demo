package com.codebuffer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@SpringBootApplication
@EnableAutoConfiguration
@EntityScan("com.codebuffer.entity")
public class SpringMicroservice1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringMicroservice1Application.class, args);
	}

}

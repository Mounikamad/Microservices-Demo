package com.codebuffer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer 
public class EurokaServer12Application {

	public static void main(String[] args) {
		SpringApplication.run(EurokaServer12Application.class, args);
	}

}

package com.cicd.cicdappliedtospringbootjavaapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdAppliedToSpringBootJavaAppApplication {

	@RequestMapping
	String sayHello() {
		return "Hello world from dzone";
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(CicdAppliedToSpringBootJavaAppApplication.class, args);
	}

}

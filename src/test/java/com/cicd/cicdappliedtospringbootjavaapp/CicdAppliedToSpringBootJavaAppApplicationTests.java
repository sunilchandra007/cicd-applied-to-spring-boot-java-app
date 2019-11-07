package com.cicd.cicdappliedtospringbootjavaapp;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class CicdAppliedToSpringBootJavaAppApplicationTests {

	@Autowired
	private CicdAppliedToSpringBootJavaAppApplication helloController;

	@Test
	public void contextLoads() {
		
		Assertions.assertEquals("Hello world from dzone",helloController.sayHello() );
	}

}

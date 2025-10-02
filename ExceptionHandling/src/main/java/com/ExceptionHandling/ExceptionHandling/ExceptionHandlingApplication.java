package com.ExceptionHandling.ExceptionHandling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExceptionHandlingApplication {

	public static void main(String[] args) {

		SpringApplication.run(ExceptionHandlingApplication.class, args);
		System.out.println("Global Exception Handling Class Started");
		System.out.println("added 3rd line");
		
	}

}

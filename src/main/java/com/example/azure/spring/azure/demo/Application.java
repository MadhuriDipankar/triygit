package com.example.azure.spring.azure.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Application {
	

@RestController
@GetMapping (value = "/")
	public String wish()
	{     
		return "Hello from Spring boot to Azure...Thanks ";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

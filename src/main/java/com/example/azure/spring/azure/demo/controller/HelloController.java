package com.example.azure.spring.azure.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping("Welcome")
	public String wish()
	{     
		return "Hello from Spring boot to Azure... ";
	}

}

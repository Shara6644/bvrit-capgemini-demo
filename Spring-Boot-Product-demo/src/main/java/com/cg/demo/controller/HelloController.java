package com.cg.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@PostMapping("hello")
	public  String sayHello()
	{
		return "Welcome to Spring rest ";
	}
}

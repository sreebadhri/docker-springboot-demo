package com.example.dockerspringbootdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeResource {

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello Docker World!!!";
	}
	
}

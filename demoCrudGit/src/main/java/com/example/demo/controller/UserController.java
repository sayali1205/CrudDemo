package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@PostMapping("/postData")
	public String logincheck() {
		
		System.out.println("this is jaya");
		return "Login check method";
		
	}
}

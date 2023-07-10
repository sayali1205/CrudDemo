package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@PostMapping("/postData")
	public String logincheck() {
		
		return "Login check method";
	}
}

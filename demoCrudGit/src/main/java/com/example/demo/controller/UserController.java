package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


	@PostMapping("/postData")
	public String logincheck() {
		
		System.out.println("this is jaya");
		System.out.println("kay kay karun thewal g project madhe");
		return "Login check method";
		
	}

  
  

}

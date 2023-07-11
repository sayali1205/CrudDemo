package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService us;

	@PostMapping("/postData")
	public String logincheck() {
		
		System.out.println("this is jaya");
		System.out.println("kay kay karun thewal g project madhe");
		return "Login check method";
		
	}
	
	@GetMapping("/getUser")
	public Iterable<User> getUser()
	{
		return us.getUser();
	}

  
  

}

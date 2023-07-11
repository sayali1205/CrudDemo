package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	@PostMapping("/saveData")
	public User createUser(@RequestBody User u)
	{
		return us.saveUser(u);
	}

  
  

}

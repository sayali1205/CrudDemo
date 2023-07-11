package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
		
		
		return "Login check method";
		
	}
	
	@GetMapping("/getUser")
	public Iterable<User> getUser()
	{
		return us.getUser();
	}
	@PostMapping("/saveData")
	public User createUser(@RequestBody User u)
	{
		return us.saveUser(u);

	}

  
  

}

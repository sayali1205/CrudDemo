package com.example.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepositry;
import com.example.demo.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepositry ur;

	@Override
	public Iterable<User> getUser() 
	{
		return ur.findAll();
	}

	
	@Override
	public User saveUser(User u) {
		
		return ur.save(u);
	}
	@Override
	public User updateUserData(User u) {
		// TODO Auto-generated method stub
		return ur.save(u);
	}

}

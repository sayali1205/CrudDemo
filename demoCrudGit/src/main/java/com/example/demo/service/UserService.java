package com.example.demo.service;

import com.example.demo.model.User;

public interface UserService {

public	Iterable<User> getUser();

	public User saveUser(User u);

	public User updateUserData(User u);

}

package com.hexaware.ecom.service;

import java.util.List;

import com.hexaware.ecom.entity.User;


public interface IUserService {
	public List<User> getUsers();
	public User addUser(User user);
	public User checkLogin(String username,String password);
	public boolean checkUserExists(String username);
}

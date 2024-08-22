package com.example.user_handling.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.user_handling.dao.UserDao;
import com.example.user_handling.entities.User;

@Service
public class UserService{
	
	@Autowired
	private UserDao userDao;
	
	public User getUserById(Long id) {
		return userDao.findById(id).orElse(null);
	}
	
	public List<User> getAllUsers(){
		return userDao.findAll();
	}
	
	public User addUser(User user) {
		return userDao.save(user);
	}
	
	public User editUser(Long id) {
		User user = userDao.findById(id).orElse(null);
		return userDao.save(user);
	}
	
	public void deleteUser(Long id) {
		userDao.deleteById(id);
	}
}

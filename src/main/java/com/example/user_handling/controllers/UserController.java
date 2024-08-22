package com.example.user_handling.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.user_handling.entities.User;
import com.example.user_handling.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/getUsers")
	public String getUsers(Model model) {
		model.addAttribute("usersList",userService.getAllUsers());
		return "ViewUsers";
	}
	
	@GetMapping("/addUser")
	public String addUser(Model model) {
		model.addAttribute("user", new User());
		return "AddUser";
	}
	
	@PostMapping("/saveUser")
	public String saveUser(User user) {
		userService.addUser(user);
		
		return "redirect:/getUsers";
	}
}

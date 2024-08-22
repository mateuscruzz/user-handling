package com.example.user_handling.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.user_handling.entities.User;

@Controller
public class UserController {

	@GetMapping("/addUser")
	public String addUser(Model model) {
		model.addAttribute("user", new User());
		return "AddUser";
	}
	
	@PostMapping("/saveUser")
	public void saveUser(User user) {
		System.out.println("User has came through");
	}
}

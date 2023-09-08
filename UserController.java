package com.banking.bankingapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.banking.bankingapp.model.User;
import com.banking.bankingapp.service.UserService;
@RestController
public class UserController {
	@Autowired
	UserService userService;
	
	@GetMapping("/showmessage")
	public String showMessage() {
		return "Returned USer";
	}
	
	@PostMapping("/saveuser")
	public void saveuser(@RequestBody User u) {
		  userService.saveUser(u);
		
		
	}
}

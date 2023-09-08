package com.banking.bankingapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.bankingapp.model.User;
import com.banking.bankingapp.repository.UserRepo;

@Service
public class UserService {
	@Autowired
	UserRepo userRepo;
	
	public User saveUser(User u) {
		User obj = userRepo.save(u);
		return obj;
	}
	
}

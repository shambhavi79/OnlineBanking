package com.banking.bankingapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class WelcomeController {
	@GetMapping
	public String showMessage() {
		return "Welcome";
	}

}

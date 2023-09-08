package com.banking.bankingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banking.bankingapp.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
	
}

package com.userm.pa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userm.pa.entities.User;
import com.userm.pa.repo.RoleRepository;
import com.userm.pa.repo.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepo;
	@Autowired
	RoleRepository roleRepo;
	public List<User> getAllUsersHasRole() {
		return userRepo.getAllUsersHasRole();
	}
	public List<User> getAllUsersHasnoRole() {
		return userRepo.getAllUsersHasnoRole();
	}
}

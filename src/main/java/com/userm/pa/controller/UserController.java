package com.userm.pa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.userm.pa.entities.User;
import com.userm.pa.service.UserService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("api/users")
public class UserController {
	
	@Autowired
	UserService usersvc;
	
	@GetMapping("/getallHasrole")
    public ResponseEntity<List<User>> getAllUsersHasRole(){
        List<User> users = usersvc.getAllUsersHasRole();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
	

	@GetMapping("/getallHasnorole")
    public ResponseEntity<List<User>> getAllUsersHasnoRole(){
        List<User> users = usersvc.getAllUsersHasnoRole();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

}

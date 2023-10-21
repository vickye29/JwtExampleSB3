package com.jwt.example.controller;

import java.security.Principal;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.example.model.User;
import com.jwt.example.service.UserService;


@RestController
@RequestMapping("/home")
public class HomeController {
	
	@Autowired
	private UserService userService;
	
	Logger logger = LoggerFactory.getLogger(HomeController.class);

//	http://localhost:8080/home/getUsers
	@GetMapping("/getUsers")
	public List<User> getUser()
	{
		logger.info("Getting Users");
		return userService.getUsers();
	}
	
//	http://localhost:8080/home/currentUser
	@GetMapping("currentUser")
	public String getLogedInUser(Principal principal)
	{
		return principal.getName();
	}
}

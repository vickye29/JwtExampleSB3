package com.jwt.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.jwt.example.model.User;

@Service
public class UserService {

	private List<User> store = new ArrayList<>();
	
	public UserService()
	{
		store.add(new User(UUID.randomUUID().toString(),"Vivek muneshwar1","vivek1@dev.in" ));
		store.add(new User(UUID.randomUUID().toString(),"Vivek muneshwar2","vivek2@dev.in" ));
		store.add(new User(UUID.randomUUID().toString(),"Vivek muneshwar3","vivek3@dev.in" ));
		store.add(new User(UUID.randomUUID().toString(),"Vivek muneshwar4","vivek4@dev.in" ));	
	}
	
	public List<User> getUsers()
	{
		return this.store;
	}
}

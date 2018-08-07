package com.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	UserRepository userRepository;

	@RequestMapping("/users")
	public User[] getAllUser() {
		return userRepository.getAllUser();
	}

	@RequestMapping("/user/{id}")
	public User getUser(@PathVariable("id") String id) {
		return userRepository.getUser(id);
	}

}

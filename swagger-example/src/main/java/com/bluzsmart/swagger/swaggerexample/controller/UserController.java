package com.bluzsmart.swagger.swaggerexample.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bluzsmart.swagger.swaggerexample.domain.User;

@RestController
@RequestMapping("/rest/user")
public class UserController {

	public List<User> getUsers() {
		return Arrays.asList(new User("Alex", 1000L), new User("Gorden", 2000L));
	}

	@GetMapping("/{username}")
	public User getUser(@PathVariable final String userName) {
		return new User("Geeth", 300L);
	}
}
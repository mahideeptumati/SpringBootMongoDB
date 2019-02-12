package com.springboot.mongodb.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.mongodb.documents.User;
import com.springboot.mongodb.repository.UserRepository;

@RestController
@RequestMapping(value = "/user")
public class UserController {

	private final UserRepository userRepository;

	public UserController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@RequestMapping(value = "/showAllUsers", method = RequestMethod.GET)
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@RequestMapping(value = "showUser/{userId}", method = RequestMethod.GET)
	public User getUser(@PathVariable String userId) {
		return userRepository.findOne(userId);
	}

	@RequestMapping(value = "/createUser", method = RequestMethod.POST)
	public User addNewUsers(@RequestBody User user) {
		return userRepository.save(user);
	}

	@RequestMapping(value = "/getAllUserSettings/{userId}", method = RequestMethod.GET)
	public Object getAllUserSettings(@PathVariable String userId) {
		User user = userRepository.findOne(userId);
		if (user != null) {
			return user.getUserSettings();
		} else {
			return "User not found.";
		}
	}

	@RequestMapping(value = "/getUserSettings/{userId}/{key}", method = RequestMethod.GET)
	public String getUserSetting(@PathVariable String userId, @PathVariable String key) {
		User user = userRepository.findOne(userId);
		if (user != null) {
			return user.getUserSettings().get(key);
		} else {
			return "User not found.";
		}
	}

	@RequestMapping(value = "/addUserSetting/{userId}/{key}/{value}", method = RequestMethod.GET)
	public String addUserSetting(@PathVariable String userId, @PathVariable String key, @PathVariable String value) {
		User user = userRepository.findOne(userId);
		if (user != null) {
			user.getUserSettings().put(key, value);
			userRepository.save(user);
			return "Key added";
		} else {
			return "User not found.";
		}
	}
}
/**
 * 
 */
package com.springboot.mongodb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.mongodb.documents.User;
import com.springboot.mongodb.repository.UserRepository;

/**
 * @author Mahideep Tumati
 *
 * Created on Feb 11, 2019
 */

@RestController
public class UserController {

	@Autowired
	UserRepository userRepository;
	
	
	@RequestMapping(value="/createUsers", method=RequestMethod.GET	)
	String createUsers(){
		
		
		
		userRepository.save(new User(1, "Jack", "Foo", "hyd", 99887));
		System.out.println(" USer Entry inserted");
		
		return "USer inserted";
	}
	
	
	@RequestMapping(value="/showUsers", method=RequestMethod.GET)
	List<User> displayUsers(){
		
		System.out.println("Fetching user entries please wait!!");
		return userRepository.findAll();
		
	}
	
	
	
	
	
}

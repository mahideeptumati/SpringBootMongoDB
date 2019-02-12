
/**
 * 
 * Author :Mahideep 2019
 * 
 */
package com.springboot.mongodb.service;


import java.util.List;

import com.springboot.mongodb.documents.User;



public interface UserInterface {

	List<User> getAllUsers();

	User getUserById(String userId);

	User addNewUser(User user);

	Object getAllUserSettings(String userId);

	String getUserSetting(String userId, String key);

	String addUserSetting(String userId, String key, String value);
}
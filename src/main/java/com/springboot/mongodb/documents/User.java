/**
 * 
 * Author :Mahideep 2019
 * 
 */

package com.springboot.mongodb.documents;

import java.util.HashMap;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="user")
public class User {

	@Id
	private String userId;
	private String name;
	private String address;

	private Map<String, String> userSettings = new HashMap<>();

	
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreationDate() {
		return address;
	}

	public void setCreationDate(String address) {
		this.address = address;
	}

	

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Map<String, String> getUserSettings() {
		return userSettings;
	}

	public void setUserSettings(Map<String, String> userSettings) {
		this.userSettings = userSettings;
	}

	/**
	 * @param userId
	 * @param name
	 * @param creationDate
	 * @param userSettings
	 */
	public User(String userId, String name, String address) {
		super();
		this.userId = userId;
		this.name = name;
		this.address = address;
	}
	
	
	
}
/**
 * 
 */
package com.springboot.mongodb.documents;

import java.math.BigInteger;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Mahideep Tumati
 *
 * Created on Feb 11, 2019
 */

@Document(collection="user")
public class User {

	
	@Id 
	private Integer id;
	
	private String firstName;
	
	private String lastName;
	
	private String address;
	
	private int mobile;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	/**
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param address
	 * @param mobile
	 */
	public User(Integer id, String firstName, String lastName, String address, int mobile) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.mobile = mobile;
	}
	
	
	
	
}

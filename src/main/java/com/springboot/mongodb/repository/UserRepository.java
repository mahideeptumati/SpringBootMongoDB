/**
 * 
 */
package com.springboot.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springboot.mongodb.documents.User;

/**
 * @author Mahideep Tumati
 *
 * Created on Feb 11, 2019
 */
public interface UserRepository extends MongoRepository<User, Integer> {
	
	
	

}

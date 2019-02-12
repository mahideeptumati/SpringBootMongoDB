/**
 * 
 */
package com.springboot.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springboot.mongodb.documents.User;

/**
 * @author Mahideep Tumati
 *
 * Created on Feb 11, 2019
 */
@Repository
public interface UserRepository extends MongoRepository<User, String> {
}

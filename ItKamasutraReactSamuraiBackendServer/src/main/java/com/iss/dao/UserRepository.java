package com.iss.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.iss.model.User;

public interface UserRepository extends MongoRepository<User, String>{

}
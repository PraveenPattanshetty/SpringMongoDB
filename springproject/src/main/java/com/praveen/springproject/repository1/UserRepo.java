package com.praveen.springproject.repository1;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.praveen.springproject.dto.User;

// @Repository
public interface UserRepo extends MongoRepository <User,String>{
    
}

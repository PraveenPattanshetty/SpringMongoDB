package com.praveen.springproject.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.praveen.springproject.dto.User;
import com.praveen.springproject.repository1.UserRepo;

@Repository
public class UserDao {
    
  
    @Autowired
    UserRepo repository;

      public void save(User user) {
       repository.save(user);
    }

}

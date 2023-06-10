package com.praveen.springproject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.praveen.springproject.dao.UserDao;
import com.praveen.springproject.dto.User;
import com.praveen.springproject.helper.Login;

@Service
public class UserService {
   
    @Autowired
    UserDao dao;

    @Autowired
    User user;

     public void signup(Login login) {
        User user = new User(login.getName(), login.getEmail(), login.getPassword());
        dao.save(user);
     }



}
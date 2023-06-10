package com.praveen.springproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.praveen.springproject.Service.UserService;

import com.praveen.springproject.helper.Login;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserService service;

     @PostMapping("/signup")
    public ResponseEntity<String> signup(@ModelAttribute Login login) {
        service.signup(login);
        return new ResponseEntity<>("User registered successfully", HttpStatus.CREATED);
    }
}

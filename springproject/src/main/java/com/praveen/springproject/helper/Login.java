package com.praveen.springproject.helper;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Login {
    private String name;
    private String email;
    private String password;
}

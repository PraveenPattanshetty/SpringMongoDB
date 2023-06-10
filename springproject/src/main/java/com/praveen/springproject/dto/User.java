package com.praveen.springproject.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "UserDetails")
@Data
@Component
@AllArgsConstructor
@NoArgsConstructor
public class User {
    
    
    @Id
    private String email;
    private String name;
    private String password;

//  public User() {
       
//     }

//     public User(String name, String email, String password) {
//         this.name = name;
//         this.email = email;
//         this.password = password;
//     }
}

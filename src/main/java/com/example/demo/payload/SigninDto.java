package com.example.demo.payload;

import lombok.Data;

@Data
public class SigninDto {

    private String name;
    private String username;
    private String email;
    private String password;
}

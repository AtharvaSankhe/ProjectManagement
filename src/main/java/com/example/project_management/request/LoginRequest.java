package com.example.project_management.request;


import lombok.Data;

@Data
public class LoginRequest {
    private String email;
    private String password;
}

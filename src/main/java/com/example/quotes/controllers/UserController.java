package com.example.quotes.controllers;

import com.example.quotes.entities.User;
import com.example.quotes.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    // API to create a new user
    @PostMapping("/add")
    public void createUser(@RequestBody User newUser) {
        userService.save(newUser);
    }
}

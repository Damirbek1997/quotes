package com.example.quotes.services;

import com.example.quotes.entities.User;
import com.example.quotes.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    // Method to save
    public void save(User user) {
        userRepository.save(user);
    }
}

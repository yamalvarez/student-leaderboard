package com.yasiel.studentleaderboard.service;

import com.yasiel.studentleaderboard.model.User;
import com.yasiel.studentleaderboard.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    // Method to register a user (username, password, role)
    public User registerUser(String username, String password, String role) {
        String encodedPassword = passwordEncoder.encode(password);  // Encode the password before saving it
        User user = new User();
        user.setUsername(username);
        user.setPassword(encodedPassword);
        user.setRole(role);  // Set the role (e.g., "STUDENT", "ADMIN")
        return userRepository.save(user);  // Save the user to the database
    }

    // Method to find a user by their username
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}

package com.yasiel.studentleaderboard.controller;

import com.yasiel.studentleaderboard.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthenticationController {

    @Autowired
    private UserService userService;

    // Show registration page
    @GetMapping("/register")
    public String showRegistrationPage() {
        return "register";  // Return the registration view (HTML page)
    }

    // Handle user registration
    @PostMapping("/register")
    public String registerUser(@RequestParam String username,
                               @RequestParam String password,
                               @RequestParam String role) {
        userService.registerUser(username, password, role);  // Register the user
        return "redirect:/login";  // Redirect to login page after successful registration
    }

    // Show login page
    @GetMapping("/login")
    public String showLoginPage() {
        return "login";  // Return the login view (HTML page)
    }
}

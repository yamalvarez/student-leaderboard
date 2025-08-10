package com.yasiel.studentleaderboard.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.LogoutConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(authz -> authz
                        .requestMatchers("/login", "/register").permitAll()  // Allow access to login and register pages
                        .requestMatchers("/students/**").hasRole("STUDENT")  // Students can access student-related pages
                        .requestMatchers("/admin/**").hasRole("ADMIN")  // Admins can access admin pages
                        .anyRequest().authenticated()  // Any other request requires authentication
                )
                .formLogin(form -> form
                        .loginPage("/login")
                        .permitAll()  // Allow all to access the login page
                )
                .logout(LogoutConfigurer::permitAll  // Allow all to log out
                );

        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();  // Password encoding using BCrypt
    }
}

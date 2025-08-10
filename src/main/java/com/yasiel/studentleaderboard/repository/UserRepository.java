package com.yasiel.studentleaderboard.repository;

import com.yasiel.studentleaderboard.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // Custom query to find a user by their username
    User findByUsername(String username);
}

package com.yasiel.studentleaderboard.controller;

import com.yasiel.studentleaderboard.model.Student;
import com.yasiel.studentleaderboard.repository.StudentRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    // Inject the StudentRepository to interact with the database
    @Autowired
    private StudentRepository repository;

    /**
     * Create a new student
     * This endpoint receives a JSON object and saves it to the database
     * URL: POST /students
     */
    @PostMapping
    public Student addStudent(@Valid @RequestBody Student student) {
        return repository.save(student);
    }

    /**
     * Get all students from the database
     * URL: GET /students
     */
    @GetMapping
    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    /**
     * Get the top 5 students by score (descending order)
     * This result is cached using Redis for faster access
     * URL: GET /students/leaderboard
     */
    @GetMapping("/leaderboard")
    @Cacheable("leaderboard") // Redis will cache the result of this method
    public List<Student> getTop5Students() {
        return repository.findTop5ByOrderByScoreDesc();
    }
}

package com.yasiel.studentleaderboard.controller;

import com.yasiel.studentleaderboard.model.Student;
import com.yasiel.studentleaderboard.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    // Inject the StudentService to handle business logic
    @Autowired
    private StudentService studentService;

    /**
     * Create a new student.
     * This endpoint receives a JSON object and saves it to the database.
     * URL: POST /students
     */
    @PostMapping
    public Student addStudent(@Valid @RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    /**
     * Get all students from the database.
     * URL: GET /students
     */
    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    /**
     * Get the top 5 students by score (descending order).
     * URL: GET /students/leaderboard
     */
    @GetMapping("/leaderboard")
    public List<Student> getTop5Students() {
        return studentService.getTop5Students();
    }
}

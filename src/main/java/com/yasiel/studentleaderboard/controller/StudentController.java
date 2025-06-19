package com.yasiel.studentleaderboard.controller;

import com.yasiel.studentleaderboard.dto.StudentRequest;
import com.yasiel.studentleaderboard.dto.StudentResponse;
import com.yasiel.studentleaderboard.model.Student;
import com.yasiel.studentleaderboard.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    // Inject the StudentService to handle business logic
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public ResponseEntity<?> addStudent(@Valid @RequestBody Student student, BindingResult result) {
        if (result.hasErrors()) {
            String errorMessage = result.getAllErrors().get(0).getDefaultMessage();
            return ResponseEntity.badRequest().body(errorMessage);
        }

        Student savedStudent = studentService.addStudent(student);
        return ResponseEntity.ok(savedStudent);
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

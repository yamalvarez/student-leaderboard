package com.yasiel.studentleaderboard.controller;

import com.yasiel.studentleaderboard.dto.StudentRequest;
import com.yasiel.studentleaderboard.dto.StudentResponse;
import com.yasiel.studentleaderboard.model.Student;
import com.yasiel.studentleaderboard.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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
    public ResponseEntity<?> addStudent(@Valid @RequestBody StudentRequest request, BindingResult result) {
        if (result.hasErrors()) {
            String errorMessage = result.getAllErrors().get(0).getDefaultMessage();
            return ResponseEntity.badRequest().body(errorMessage);
        }

        Student student = new Student();
        student.setName(request.getName());
        student.setGradeLevel(request.getGradeLevel());
        student.setScore(request.getScore());

        Student savedStudent = studentService.addStudent(student);
        return ResponseEntity.ok(savedStudent);
    }


    /**
     * Get all students from the database.
     * URL: GET /students
     */
    @GetMapping
    public Page<Student> getAllStudents(@RequestParam(defaultValue = "0") int page,
                                        @RequestParam(defaultValue = "5") int size) {
        Pageable pageable = PageRequest.of(page, size);
        return studentService.getAllStudents(pageable);
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

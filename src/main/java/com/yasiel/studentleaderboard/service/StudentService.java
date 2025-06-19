package com.yasiel.studentleaderboard.service;

import com.yasiel.studentleaderboard.model.Student;
import com.yasiel.studentleaderboard.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository repository;

    @Autowired
    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public List<Student> getTop5Students() {
        return repository.findTop5ByOrderByScoreDesc();
    }

    public Page<Student> getAllStudents(Pageable pageable) {
        return repository.findAll(pageable);
    }


    public Student addStudent(Student student) {
        return repository.save(student);
    }
}

package com.yasiel.studentleaderboard.service;

import com.yasiel.studentleaderboard.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface StudentService {
    Student addStudent(Student student);
    Page<Student> getAllStudents(Pageable pageable);
    List<Student> getTop5Students();
}

package com.yasiel.studentleaderboard.service;

import com.yasiel.studentleaderboard.model.Student;
import com.yasiel.studentleaderboard.repository.StudentRepository;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    @CacheEvict(value = "leaderboard", allEntries = true)
    public Student addStudent(Student student) {
        System.out.println("🚨 Saving student: " + student);
        return studentRepository.save(student);
    }

    @Override
    @Cacheable(value = "studentsPage", key = "#pageable.pageNumber")
    public Page<Student> getAllStudents(Pageable pageable) {
        System.out.println("📥 Fetching all students from DB for page: " + pageable.getPageNumber());
        return studentRepository.findAll(pageable);
    }

    @Override
    @Cacheable(value = "leaderboard")
    public List<Student> getTop5Students() {
        System.out.println("🔥 Getting top 5 students from DB");
        return studentRepository.findTop5ByOrderByScoreDesc();
    }
}

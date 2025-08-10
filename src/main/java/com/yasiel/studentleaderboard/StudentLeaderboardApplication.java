package com.yasiel.studentleaderboard;

import com.yasiel.studentleaderboard.model.Student;
import com.yasiel.studentleaderboard.repository.StudentRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class StudentLeaderboardApplication {
    public static void main(String[] args) {
        SpringApplication.run(StudentLeaderboardApplication.class, args);
    }

    @Autowired
    private StudentRepository studentRepository;

    @PostConstruct
    public void initTestStudent() {
        Student student = new Student("StartupTest", 88, 11);
        studentRepository.save(student);
        System.out.println("✅ Test student saved at startup: " + student);
    }
}

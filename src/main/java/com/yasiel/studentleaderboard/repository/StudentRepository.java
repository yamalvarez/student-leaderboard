package com.yasiel.studentleaderboard.repository;

import com.yasiel.studentleaderboard.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findTop5ByOrderByScoreDesc();
}

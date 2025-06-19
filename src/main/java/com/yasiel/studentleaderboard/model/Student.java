package com.yasiel.studentleaderboard.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import jakarta.validation.constraints.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @NotBlank(message = "Name is required")
        private String name;

        @Min(value = 1, message = "Grade level must be at least 1")
        @Max(value = 12, message = "Grade level must be at most 12")
        private int gradeLevel;

        @Min(value = 0, message = "Score must be at least 0")
        @Max(value = 100, message = "Score must be at most 100")
        private int score;


    public Student(Long id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public Student(String name, int score, int gradeLevel) {
    }
}

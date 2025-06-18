package com.yasiel.studentleaderboard.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private Long id;
    private String name;
    private int score;
    private int grade;

    public Student(Long id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }
}

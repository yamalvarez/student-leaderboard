// StudentResponse.java
package com.yasiel.studentleaderboard.dto;

public class StudentResponse {

    private Long id;
    private String name;
    private int score;

    public StudentResponse(Long id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}

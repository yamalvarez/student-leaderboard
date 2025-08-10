package com.yasiel.studentleaderboard.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public record StudentDto(
        @NotBlank(message = "Name is required") String name,
        @Min(value = 0, message = "Score must be at least 0")
        @Max(value = 100, message = "Score must be at most 100")
        int score,
        @Min(value = 1, message = "Grade level must be at least 1")
        @Max(value = 12, message = "Grade level must be at most 12")
        Integer gradeLevel
) {}
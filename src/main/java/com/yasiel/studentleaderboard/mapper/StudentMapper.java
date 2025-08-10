package com.yasiel.studentleaderboard.mapper;

import com.yasiel.studentleaderboard.dto.StudentDto;
import com.yasiel.studentleaderboard.dto.StudentResponse;
import com.yasiel.studentleaderboard.model.Student;

public final class StudentMapper {
    private StudentMapper() {}

    public static Student toEntity(StudentDto dto) {
        Student s = new Student();
        s.setName(dto.name());
        s.setScore(dto.score());
        if (dto.gradeLevel() != null) {
            s.setGradeLevel(dto.gradeLevel());
        }
        return s;
    }

    public static StudentResponse toResponse(Student s) {
        return new StudentResponse(s.getId(), s.getName(), s.getScore());
    }
}

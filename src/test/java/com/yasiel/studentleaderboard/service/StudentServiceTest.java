package com.yasiel.studentleaderboard.service;

import com.yasiel.studentleaderboard.model.Student;
import com.yasiel.studentleaderboard.repository.StudentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    private StudentRepository repository;
    private StudentService service;

    @BeforeEach
    void setUp() {
        repository = mock(StudentRepository.class); // Create a mock repository
        service = new StudentService(repository);   // Pass it to the service
    }

    @Test
    void testGetTop5Students() {
        List<Student> mockStudents = List.of(
                new Student(1L, "Yasiel", 95, 10),
                new Student(2L, "Carlos", 90, 10)
        );

        when(repository.findTop5ByOrderByScoreDesc()).thenReturn(mockStudents);

        List<Student> result = service.getTop5Students();

        assertEquals(2, result.size());
        assertEquals("Yasiel", result.get(0).getName());
    }
}

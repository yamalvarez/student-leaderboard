package com.yasiel.studentleaderboard.controller;

import com.yasiel.studentleaderboard.model.Student;
import com.yasiel.studentleaderboard.repository.StudentRepository;
import com.yasiel.studentleaderboard.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(StudentController.class)
@Import(StudentService.class) // Import service manually if you're using it
class StudentControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private StudentRepository repository; // Add this line!

    @Test
    void shouldReturnTop5Students() throws Exception {
        List<Student> mockStudents = List.of(
                new Student(1L, "Yasiel", 95, 10),
                new Student(2L, "Carlos", 90, 10)
        );

        when(repository.findTop5ByOrderByScoreDesc()).thenReturn(mockStudents);

        mockMvc.perform(get("/students/leaderboard"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.size()").value(2));
    }
}
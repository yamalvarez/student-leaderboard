package com.yasiel.studentleaderboard.config;

import com.yasiel.studentleaderboard.service.StudentService;
import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestStudentServiceConfig {

    @Bean
    public StudentService studentService() {
        return Mockito.mock(StudentService.class);
    }
}

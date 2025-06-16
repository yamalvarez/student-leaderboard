package service;

import com.yasiel.studentleaderboard.model.Student;
import com.yasiel.studentleaderboard.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

public class StudentServiceTest {

    @Mock
    private StudentRepository repository;

    @InjectMocks
    private StudentService service;

    public StudentServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void getStudentById_shouldReturnStudent() {
        // Arrange
        Student mockStudent = new Student(1L, "Yasiel", 10, 95);
        when(repository.findById(1L)).thenReturn(Optional.of(mockStudent));

        // Act
        Student result = service.getStudentById(1L);

        // Assert
        assertEquals("Yasiel", result.getName());
        assertEquals(95, result.getScore());
    }

    @Test
    void getStudentById_shouldThrowExceptionIfNotFound() {
        // Arrange
        when(repository.findById(2L)).thenReturn(Optional.empty());

        // Act & Assert
        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            service.getStudentById(2L);
        });

        assertEquals("Student not found", exception.getMessage());
    }
}

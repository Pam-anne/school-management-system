package school_management_system;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TeacherTest {

    @Test
    public void testTeacherInitialization() {
        // Verify that the constructor sets the values correctly
        Teacher teacher = new Teacher("Mr. Smith", 501, 3000.0);
        
        assertEquals("Mr. Smith", teacher.getTName(), "Teacher name should be Mr. Smith");
        assertEquals(501, teacher.getTid(), "Teacher ID should be 501");
        assertEquals(3000.0, teacher.getSalary(), "Initial salary should be 3000.0");
    }

    @Test
    public void testSalaryIncrement() {
        Teacher teacher = new Teacher("Ms. Davis", 502, 4000.0);
        
        // Update salary to 4500
        teacher.setSalary(4500.0);
        
        assertEquals(4500.0, teacher.getSalary(), "The updated salary should be 4500.0");
    }
}
package school_management_system;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class SchoolTest {
    @Test
    public void testStudentFeePayment() {
        Student testStudent = new Student(1, "Test User", 10);
        testStudent.Feepaid(5000);
        
        assertEquals(5000, testStudent.getFeePaid(), "Fee paid should be 5000");
        assertEquals(5000, testStudent.getRemainingFee(), "Remaining fee should be 5000");
    }
}


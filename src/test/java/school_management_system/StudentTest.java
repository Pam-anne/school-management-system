package school_management_system;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    public void testFeePaymentUpdatesBalance() {
        // 1. Setup: Create a student (Initial total fee is 10,000)
        Student student = new Student(1, "John Doe", 12);
        
        // 2. Execution: Pay $2500
        student.Feepaid(2500);
        
        // 3. Assertions: Verify the math
        assertEquals(2500, student.getFeePaid(), "The fee paid should be recorded as 2500");
        assertEquals(7500, student.getRemainingFee(), "The remaining fee should be 10000 - 2500 = 7500");
    }

    @Test
    public void testMultiplePayments() {
        Student student = new Student(2, "Jane Smith", 10);
        
        student.Feepaid(1000);
        student.Feepaid(2000);
        
        assertEquals(3000, student.getFeePaid(), "Total fee paid should accumulate to 3000");
        assertEquals(7000, student.getRemainingFee(), "Remaining fee should reflect both payments");
    }
}
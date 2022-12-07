import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @BeforeEach
    void setUp() {
    }
    @Test
    void TestConstructor() { //Everything should pass
        Employee emp = new Employee("Aleks Kijewski", "123456", 3530834552813, "Man", "Full-time", 21);
        assertEquals("Aleks", emp.getEmpName());
        assertEquals("123456", emp.getEmpPPSID());
        assertEquals(3530834552813, emp.getEmpPhoneNum());
        assertEquals("Man", emp.getEmpGender());
        assertEquals("Full-Time", emp.getEmpType());
        assertEquals(18, emp.getEmpAge);
    }
    @AfterEach
    void tearDown() {
    }
}
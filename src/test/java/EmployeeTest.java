import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @BeforeEach
    void setUp() {
    }
    @Test
    void testConstructor() { //Everything should pass
        Employee emp = new Employee("Aleks Kijewski", "123456", "08345528132", "Man", "Full-time", 21);
        assertEquals("Aleks Kijewski", emp.getEmpName());
        assertEquals("123456", emp.getEmpPPSID());
        assertEquals("08345528132", emp.getEmpPhoneNum());
        assertEquals("Man", emp.getEmpGender());
        assertEquals("Full-time", emp.getEmpType());
        assertEquals(21, emp.getEmpAge());
    }
 
    @AfterEach
    void tearDown() {
    }
}
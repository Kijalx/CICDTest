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
    @Test
    void testEmpGender1(){
        Employee emp = new Employee("Aleks Kijewski", "123456", "08345528132", "Women", "Full-time", 21);
        assertEquals("Women", emp.getEmpGender());
    }
    @Test
    void testEmpGender2(){
        Employee emp = new Employee("Aleks Kijewski", "123456", "08345528132", "Non-binary", "Full-time", 21);
        assertEquals("Non-binary", emp.getEmpGender());
    }
    @Test
    void testEmpType(){
        Employee emp = new Employee("Aleks Kijewski", "123456", "08345528132", "Women", "Part-time", 21);
        assertEquals("Part-time", emp.getEmpType());
    }
    @Test
    void testNameFail1(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, ()-> new Employee("1234", "123456", "08345528132", "Man", "Full-time", 21));
        assertEquals("Name must have between 5 and 22 letters",exMessage.getMessage());
    }
    @Test
    void testNameFail2(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, ()-> new Employee("12345678910111212412142", "123456", "08345528132", "Man", "Full-time", 21));
        assertEquals("Name must have between 5 and 22 letters",exMessage.getMessage());
    }
    @Test
    void testPPSIDFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, ()-> new Employee("Aleksander Kijewski", "12346", "08345528132", "Man", "Full-time", 21));
        assertEquals("PPSID Must have 6 or more digits",exMessage.getMessage());
    }
    @Test
    void testPhoneNumFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, ()-> new Employee("Aleksander Kijewski", "123456", "0834552813", "Man", "Full-time", 21));
        assertEquals("Phone Number must have 11 digits",exMessage.getMessage());
    }
    @Test
    void testGenderFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, ()-> new Employee("Aleksander Kijewski", "123456", "08345528132", "M", "Full-time", 21));
        assertEquals("Gender must be either Man, Women or Non-Binary",exMessage.getMessage());
    }
    @Test
    void testEmpTypeFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, ()-> new Employee("Aleksander Kijewski", "123456", "08345528132", "Man", "Full-tim", 21));
        assertEquals("Employment type must be either Full-time or Part-time",exMessage.getMessage());
    }
    @Test
    void testAgeFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, ()-> new Employee("Aleksander Kijewski", "123456", "08345528132", "Man", "Full-time", 17));
        assertEquals("Employee must be over the age of 18",exMessage.getMessage());
    }
    @AfterEach
    void tearDown() {
    }
}
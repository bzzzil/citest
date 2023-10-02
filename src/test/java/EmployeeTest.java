import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    Employee employee;

    @BeforeEach
    void startup() {
        employee = new Employee("Test Name", 66, "Doctor");
    }

    @org.junit.jupiter.api.Test
    void getName() {
        assertEquals("Test Name", employee.getName());
    }

    @org.junit.jupiter.api.Test
    void getAge() {
        assertEquals(66, employee.getAge());
    }

    @org.junit.jupiter.api.Test
    void getPosition() {
    }
}
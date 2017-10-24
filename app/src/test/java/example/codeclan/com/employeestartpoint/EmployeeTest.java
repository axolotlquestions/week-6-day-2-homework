package example.codeclan.com.employeestartpoint;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by sandy on 13/10/2017.
 */

public class EmployeeTest {
    Employee employee;

    @Before
    public void before() {
        employee = new Employee(5, "Wilma", "1a2b3c", 0.00);
    }
//
//    @Test
//    public void newEmployeeIdIsZero() {
//        assertEquals(0, employee.getId());
//    }
//
//    @Test
//    public void newEmployeeNameIsNull() {
//        assertNull(employee.getName());
//    }
//
//    @Test
//    public void newEmployeeSSnIsNull() {
//        assertNull(employee.getSocialSecurityNumber());
//    }
//
//    @Test
//    public void newEmployeeSalaryIsNull() {
//        assertEquals(0, employee.getSalary(), 0.01);
//    }
//
////    @Test
////    public void canSetEmployeeId() {
////        employee.setId(1);
////        assertEquals(1, employee.getId());
////    }
//
//    @Test
//    public void canSetEmployeeName() {
//        employee.setName("Wilma");
//        assertEquals("Wilma", employee.getName());
//    }

//    @Test
//    public void canSetEmployeeSsn() {
//        employee.setSocialSecurityNumber("AB123456C");
//        assertEquals("AB123456C", employee.getSocialSecurityNumber());
//    }

    @Test
    public void canRaiseSalary(){
        employee.increaseSalary(5000.0);
        assertEquals(5000.0, employee.getSalary(), 0.1);
    }

    @Test
    public void canNotRaiseSalaryByNegative(){
        employee.increaseSalary(-5000.0);
        assertEquals(0.0, employee.getSalary(), 0.1);
    }

    @Test
    public void canNotsetNametoNull(){
        employee.setName("");
        assertEquals("Wilma", employee.getName());
    }

}

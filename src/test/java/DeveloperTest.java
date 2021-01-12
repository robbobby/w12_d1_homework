import Staff.techStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    Developer employee;

    @Before public void setUp() {
        employee = new Developer("jk45", 199.00f, "Jeff");
    }
    @Test public void hasName() {
        assertEquals("Jeff", employee.getName());
    }
    @Test public void hasNiNumber() {
        assertEquals("jk45", employee.getNiNumber());
    }
    @Test public void hasSalary() {
        assertEquals(199.00, employee.getSalary(), 0.01);
    }
    @Test public void canRaiseSalary() {
        employee.raiseSalary(100f);
        assertEquals(299.00, employee.getSalary(), 0.01);
    }
    @Test public void canGetBonus() {
        assertEquals(1.99, employee.getBonus(), 0.01);
    }
    @Test public void cannotGiveNegativeRaise() {
        employee.raiseSalary(-1000);
        assertEquals(199.00, employee.getSalary(), 0.01);
    }
    @Test public void canChangeName() {
        employee.setName("Renamed");
        assertEquals("Renamed", employee.getName() );
    }
    @Test public void cannotChangeNameToNullValue() {
        employee.setName("");
        assertEquals("Jeff", employee.getName() );
    }
}



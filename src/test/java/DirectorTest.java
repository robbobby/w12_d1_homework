import Staff.Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;
    @Before public void setUp() {
        director = new Director("jk45", 199.00f, "Jeff", "cool department", 500f);
    }
    @Test public void hasName() {
        assertEquals("Jeff", director.getName());
    }
    @Test public void hasNiNumber() {
        assertEquals("jk45", director.getNiNumber());
    }
    @Test public void hasSalary() {
        assertEquals(199.00, director.getSalary(), 0.01);
    }
    @Test public void hasDepartment() {
        assertEquals("cool department", director.getDeptName());
    }
    @Test public void canRaiseSalary() {
        director.raiseSalary(100f);
        assertEquals(299.00, director.getSalary(), 0.01);
    }
    @Test public void canGetBonus() {
        assertEquals(3.98, director.getBonus(), 0.01);
    }
    @Test public void canGetBudget() {
        assertEquals(500f, director.getBudget(), 0.01);
    }
    @Test public void cannotGiveNegativeRaise() {
        director.raiseSalary(-1000);
        assertEquals(199.00, director.getSalary(), 0.01);
    }
    @Test public void canChangeName() {
        director.setName("Renamed");
        assertEquals("Renamed", director.getName() );
    }
    @Test public void cannotChangeNameToNullValue() {
        director.setName("");
        assertEquals("Jeff", director.getName() );
    }
}

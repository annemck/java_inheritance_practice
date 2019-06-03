import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    private Manager manager;

    @Before
    public void setup() {
        this.manager = new Manager("Joe", "AB 20 30 01", 10.50, "HR");
    }

    @Test
    public void canGetName() {
        assertEquals("Joe", manager.getName());
    }

    @Test
    public void canGetNiNumber() {
        assertEquals("AB 20 30 01", manager.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(10.50, manager.getSalary(), 0.00);
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(0.50);
        assertEquals(11.00, manager.getSalary(), 0.00);
    }

    @Test
    public void canGetBonus() {
        assertEquals(0.10, manager.payBonus(), 0.01);
    }

    @Test
    public void canGetDeptName() {
        assertEquals("HR", manager.getDepartmentName());
    }


    @Test
    public void cannotRaiseSalaryByNegativeNumber() {
        manager.raiseSalary(-1.50);
        assertEquals(10.50, manager.getSalary(), 0.00);
    }

    @Test
    public void cannotChangeNameIfNull() {
        manager.setName("");
        assertEquals("Joe", manager.getName());
    }
}

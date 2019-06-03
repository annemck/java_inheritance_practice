import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class DirectorTest {

    private Director director;

    @Before
    public void setup() {
        this.director = new Director("Jane", "ER 01 02 03", 15.00, "Organisation", 100000.50);
    }

    @Test
    public void canGetName() {
        assertEquals("Jane", director.getName());
    }

    @Test
    public void canGetNiNumber() {
        assertEquals("ER 01 02 03", director.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(15.00, director.getSalary(), 0.00);
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(2.50);
        assertEquals(17.50, director.getSalary(), 0.00);
    }

    @Test
    public void canGetPayBonusAtTwoPercent() {
        assertEquals(0.30, director.payBonus(), 0.01);
    }

    @Test
    public void canGetDeptName() {
        assertEquals("Organisation", director.getDepartmentName());
    }

    @Test
    public void canGetBudget() {
        assertEquals(100000.50, director.getBudget(), 0.00);
    }

    @Test
    public void cannotRaiseSalaryByNegativeNumber() {
        director.raiseSalary(-1.50);
        assertEquals(15.00, director.getSalary(), 0.00);
    }

    @Test
    public void cannotChangeNameIfNull() {
        director.setName("");
        assertEquals("Jane", director.getName());
    }
}

import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    private Developer dev;

    @Before
    public void setup() {
        this.dev = new Developer("Mary", "AB 01 02 03", 8.50);
    }

    @Test
    public void canGetName() {
        assertEquals("Mary", dev.getName());
    }

    @Test
    public void canGetNiNumber() {
        assertEquals("AB 01 02 03", dev.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(8.50, dev.getSalary(), 0.00);
    }

    @Test
    public void canRaiseSalary() {
        dev.raiseSalary(1.50);
        assertEquals(10.00, dev.getSalary(), 0.00);
    }

    @Test
    public void canGetPayBonus() {
        assertEquals(0.08, dev.payBonus(), 0.01);
    }


    @Test
    public void cannotRaiseSalaryByNegativeNumber() {
        dev.raiseSalary(-1.50);
        assertEquals(8.50, dev.getSalary(), 0.00);
    }

    @Test
    public void cannotChangeNameIfNull() {
        dev.setName("");
        assertEquals("Mary", dev.getName());
    }
}

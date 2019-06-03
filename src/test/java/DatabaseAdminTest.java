import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    private DatabaseAdmin admin;

    @Before
    public void setup() {
        this.admin = new DatabaseAdmin("Jack", "BA 01 02 03", 7.90);
    }

    @Test
    public void canGetName() {
        assertEquals("Jack", admin.getName());
    }

    @Test
    public void canGetNiNumber() {
        assertEquals("BA 01 02 03", admin.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(7.90, admin.getSalary(), 0.00);
    }

    @Test
    public void canRaiseSalary() {
        admin.raiseSalary(0.60);
        assertEquals(8.50, admin.getSalary(), 0.00);
    }

    @Test
    public void canGetPayBonus() {
        assertEquals(0.07, admin.payBonus(), 0.01);
    }


    @Test
    public void cannotRaiseSalaryByNegativeNumber() {
        admin.raiseSalary(-1.40);
        assertEquals(7.90, admin.getSalary(), 0.00);
    }

    @Test
    public void cannotChangeNameToNull() {
        admin.setName("");
        assertEquals("Jack", admin.getName());
    }
}

import Staff.techStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Ewen", "WE654321R", 28000);
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(900);
        assertEquals(28900, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(280, databaseAdmin.payBonus(), 0.01);
    }
}

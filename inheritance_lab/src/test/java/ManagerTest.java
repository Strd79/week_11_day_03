import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Kyle", "LK234567D", 30500, "Web Dev");
    }

    @Test
    public void CanRaiseSalary() {
        manager.raiseSalary(500);
        assertEquals(31000, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(305, manager.payBonus(), 0.01);
    }

    @Test
    public void canChangeName() {
        manager.setName("Kai Ho");
        assertEquals("Kai Ho", manager.getName());
    }

    @Test
    public void cannotChangeNullName() {
        manager.setName(null);
        assertEquals("Kyle", manager.getName());
    }

    @Test
    public void cannotRaiseSalaryWithNegativeIncrement() {
        manager.raiseSalary(-1000);
        assertEquals(30500, manager.getSalary(), 0.01);
    }
}

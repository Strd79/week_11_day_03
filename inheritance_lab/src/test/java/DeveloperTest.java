import Staff.techStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("David", "SD123456K", 26000);
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(800);
        assertEquals(26800, developer.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(260, developer.payBonus(), 0.01);
    }
}

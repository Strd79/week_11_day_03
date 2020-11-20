import Staff.Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("Antonia", "CA654321K", 90000, "IT", 1400000.00);
    }

    @Test
    public void CanRaiseSalary() {
        director.raiseSalary(5000);
        assertEquals(95000, director.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(1800, director.payBonus(), 0.01);
    }
}

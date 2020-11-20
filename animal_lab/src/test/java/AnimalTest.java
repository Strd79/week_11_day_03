import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimalTest {

    Animal animal;

    @Before
    public void before() {
        animal = new Animal("Kass");
    }

    @Test
    public void canEat() {
        assertEquals("I eat dog food", animal.eat("dog food"));
    }

    @Test
    public void canBreathe() {
        assertEquals("I can breathe", animal.breathe());
    }
}

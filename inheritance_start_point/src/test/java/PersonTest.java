import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    Person person;

    @Before
    public void before() {
        person = new Person("David", "G21");
    }

    @Test
    public void hasName() {
        assertEquals("David", person.getName());
    }

    @Test
    public void hasCohort() {
        assertEquals("G21", person.getCohort());;
    }

    @Test
    public void canChangeName() {
        person.setName("Kyle");
        assertEquals("Kyle", person.getName());
    }

    @Test
    public void canChangeCohort() {
        person.setCohort("G22");
        assertEquals("G22", person.getCohort());
    }

    @Test
    public void canTalk() {
        assertEquals("I love Java", person.talk("Java"));
    }
}



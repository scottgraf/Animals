package us.mattgreen.test;
import org.junit.*;
import us.mattgreen.Dog;

import static org.junit.Assert.assertEquals;

public class TestDog {

    @Test
    public void testSomething() {
        Dog dog = new Dog(true,"bleh");
        assertEquals("help",true,dog.isFriendly());
    }
}


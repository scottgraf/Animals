package us.mattgreen.test;
import org.junit.*;
import us.mattgreen.Cat;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestCat {

    @Test
    public void testSomething() {
        Cat cat = new Cat(5,"Garbage");
        assertEquals("Mouses Killed",4,cat.getMousesKilled());
    }

}

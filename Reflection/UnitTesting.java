package Reflection;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UnitTesting {

    static ReflectionTest reflection = new ReflectionTest(10, "Aushala");

    static EmenyPlayer player = new EmenyPlayer();

    @Test
    public void testReflection() {

        if (reflection.getRandString() != null || reflection.getRandString() != "") {
            String expected = "Aushala";
            String actual = reflection.getRandString();
            assertEquals(expected, actual);
        }

    }

}

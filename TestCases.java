

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class TestCases {

    @Test
    public void testLowerCase() {
        assertEquals("Lower case input", "INPUT", Converters.lowerCase("INPUT","input"));
    }



}

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTests {
    private final FactorialCycles factorialCycles = new FactorialCycles();

    @Test
    public void testFactorialWithWhileWorkAsExpected(){
        int expected = 120;

        int actual = factorialCycles.getFactorialValueWithWhile(5);

        assertEquals(actual, expected);
    }

    @Test
    public void testFactorialWithDoWhileWorkAsExpected(){
        int expected = 720;

        int actual = factorialCycles.getFactorialValueWithDoWhile(6);

        assertEquals(actual, expected);
    }

    @Test
    public void testFactorialWithForWorkAsExpected(){
        int expected = 24;

        int actual = factorialCycles.getFactorialValueWithWhile(4);

        assertEquals(actual, expected);
    }
}

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTests {
    private final FibonacciCycles fibonacciCycles = new FibonacciCycles();

    @Test
    public void testFibonacciWithWhileWorkAsExpected(){
        String expected = "0 1 1 2 3 5 ";

        String actual = fibonacciCycles.getFibonacciRowWithWhile(6);

        assertEquals(expected, actual);
    }

    @Test
    public void testFibonacciWithDoWhileWorkAsExpected(){
        String expected = "0 1 1 2 3 5 8 13 ";

        String actual = fibonacciCycles.getFibonacciRowWithDoWhile(8);

        assertEquals(expected, actual);
    }

    @Test
    public void testFibonacciWithForWorkAsExpected(){
        String expected = "0 1 1 2 3 5 8 13 21 34 ";

        String actual = fibonacciCycles.getFibonacciRowWithWhile(10);

        assertEquals(expected, actual);
    }
}

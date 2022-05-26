import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExpressionCalculatorTests {
    @Test
    public void testCalculateShouldReturnResult(){
        int a = 6;
        int p = 4;
        double m1 = 3;
        double m2 = 2;

        double expected = 106.59172753176506;

        double actual = ExpressionCalculator.calculate(a, p, m1, m2);

        assertEquals(expected, actual);
    }
}

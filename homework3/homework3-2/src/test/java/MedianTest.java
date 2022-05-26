import Providers.DoubleArrayProvider;
import Providers.IntArrayProvider;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianTest {
    @ParameterizedTest
    @ArgumentsSource(IntArrayProvider.class)
    public void testMedianWithIntegerArrayShouldWorkAsExpected(double expected, int[] values) {
        Double actual = MedianCheck.median(values);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @ArgumentsSource(DoubleArrayProvider.class)
    public void testMedianWithDoubleArrayShouldWorkAsExpected(double expected, Double[] values) {
        Double actual = MedianCheck.median(values);
        assertEquals(expected, actual);
    }
}

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SetOperationsTest {
    private final Operations operations = new SetOperations();

    private final Set<String> firstHashSet = Set.of("A", "B");
    private final Set<String> secondHashSet = Set.of("B", "C");

    @Test
    public void testUnionWorkAsExpected() {
        Set<String> expected = Set.of("A", "B", "C");

        Set<String> actual = operations.union(firstHashSet, secondHashSet);

        assertEquals(expected, actual);
    }

    @Test
    public void testIntersectionWorkAsExpected() {
        Set<String> expected = Set.of("B");

        Set<String> actual = operations.intersection(firstHashSet, secondHashSet);

        assertEquals(expected, actual);
    }

    @Test
    public void testMinusWorkAsExpected() {
        Set<String> expected = Set.of("A");

        Set<String> actual = operations.minus(firstHashSet, secondHashSet);

        assertEquals(expected, actual);
    }

    @Test
    public void testDifferenceWorkAsExpected() {
        Set<String> expected = Set.of("A", "C");

        Set<String> actual = operations.difference(firstHashSet, secondHashSet);

        assertEquals(expected, actual);
    }
}

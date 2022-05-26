import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ListOperationsTest {
    private final ListOperations listOperations = new ListOperations();
    private final int[] testList = {1, 2, 3, 19, 22, -7, -12, 2};

    @Test
    public void testContainsShouldReturnTrue() {
        assertTrue(listOperations.contains(testList, 2));
    }

    @Test
    public void testContainsShouldReturnFalse() {
        assertFalse(listOperations.contains(testList, -78));
    }

    @Test
    public void testAddItemShouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> listOperations.addItem(testList, 1));
    }

    @Test
    public void testAddItemShouldWorkAsExpected() {
        int[] excepted = {1, 2, 3, 19, 22, -7, -12, 2, 0};

        int[] actual = listOperations.addItem(testList, 0);

        assertArrayEquals(actual, excepted);
    }

    @Test
    public void testGetIndexOfItemShouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> listOperations.getIndexOfItem(testList, -77));
    }

    @Test
    public void testGetIndexOfItemShouldWorkAsExpected() {
        int expected = 3;

        int actual = listOperations.getIndexOfItem(testList, 19);

        assertEquals(actual, expected);
    }

    @Test
    public void testRemoveItemShouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> listOperations.removeItem(testList, 998));
    }

    @Test
    public void testRemoveItemShouldWorkAsExpected() {
        int[] expected = {1, 2, 3, 19, -7, -12, 2};

        int[] actual = listOperations.removeItem(testList, 22);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testLastIndexOfShouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> listOperations.lastIndexOf(testList, -1212));
    }

    @Test
    public void testLastIndexOfShouldWorkAsExpected() {
        int expected = 7;

        int actual = listOperations.lastIndexOf(testList, 2);

        assertEquals(actual, expected);
    }
}

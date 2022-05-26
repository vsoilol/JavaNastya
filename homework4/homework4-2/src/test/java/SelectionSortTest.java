import SortMethods.SelectionSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SelectionSortTest {
    private final SelectionSort selectionSort = new SelectionSort();
    private final int[] testArray = {8,-2,12,0};

    @Test
    public void testBubbleSortWorkAsExpected(){
        int[] expected = {-2,0,8,12};

        int[] actual = selectionSort.sort(testArray);

        assertArrayEquals(actual, expected);
    }
}

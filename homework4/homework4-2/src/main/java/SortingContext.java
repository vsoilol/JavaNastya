import SortMethods.Sorter;

public class SortingContext {
    private final Sorter sorter;

    public SortingContext(Sorter sorter) {
        this.sorter = sorter;
    }

    public int[] executeSort(int[] array) {
        sorter.sort(array);

        return array;
    }
}

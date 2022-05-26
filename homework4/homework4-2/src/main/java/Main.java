import ArrayWorker.ArrayWorker;
import SortMethods.SelectionSort;

public class Main {
    public static void main(String[] args) {
        SortingContext sortingContext = new SortingContext(new SelectionSort());
        ArrayWorker arrayWorker = new ArrayWorker();

        int[] array = arrayWorker.getRandomNumbersArray();

        System.out.print("Unsorted array\n");
        arrayWorker.showArray(array);

        int[] sortedArray = sortingContext.executeSort(array);

        System.out.print("\nSorted array\n");
        arrayWorker.showArray(sortedArray);
    }
}

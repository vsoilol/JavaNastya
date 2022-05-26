package ArrayWorker;

import java.util.Random;

public class ArrayWorker {
    public int[] getRandomNumbersArray() {
        Random random = new Random();
        int[] array = new int[15];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 20);
        }

        return array;
    }

    public void showArray(int[] array) {
        for (int item : array) {
            System.out.print(item + " ");
        }
    }
}

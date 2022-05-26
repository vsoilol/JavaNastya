import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        IntegerSumDigitsComparator comparator = new IntegerSumDigitsComparator();

        Integer[] array = new Integer[]{44, 56, 403, 107, 1111};

        System.out.println(Arrays.toString(Arrays.stream(array).sorted(comparator).toArray()));
    }
}

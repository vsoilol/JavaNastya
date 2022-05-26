import java.util.Comparator;

public class IntegerSumDigitsComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer number1, Integer number2) {
        return sumOfDigits(number1).compareTo(sumOfDigits(number2));
    }

    private Integer sumOfDigits(Integer number) {
        int sum = 0;

        do {
            sum += number % 10;
            number /= 10;
        } while (number > 0);

        return sum;
    }
}

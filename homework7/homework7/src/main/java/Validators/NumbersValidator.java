package Validators;

public class NumbersValidator implements Validator<Integer> {
    @Override
    public boolean isValid(Integer value) {
        return value >= 1 && value <= 10;
    }
}

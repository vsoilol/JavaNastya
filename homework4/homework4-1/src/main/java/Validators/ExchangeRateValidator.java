package Validators;

public class ExchangeRateValidator {
    public boolean isValid(double exchangeRate){
        return exchangeRate > 0;
    }
}

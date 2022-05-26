package ConsoleProviders;

import Resources.ExceptionMessages;
import Validators.*;
import java.util.Scanner;

public class ConsoleReader {
    private final Scanner scanner = new Scanner(System.in);
    private final ValuesValidator validator = new ValuesValidator();
    private final ExchangeRateValidator exchangeRateValidator = new ExchangeRateValidator();

    public String getText(String message){
        System.out.print(message);

        return scanner.nextLine();
    }

    public int getValue(String message) throws NumberFormatException{
        String value = getText(message);

        if(validator.isValid(value)){
            return Integer.parseInt(value);
        }

        throw new NumberFormatException(ExceptionMessages.INCORRECT_INPUT);
    }

    public double getExchangeRate(String message) throws NumberFormatException{
        String value = getText(message);

        if(validator.isValid(value) && exchangeRateValidator.isValid(Double.parseDouble(value))){
            return Double.parseDouble(value);
        }

        throw new NumberFormatException(ExceptionMessages.INCORRECT_INPUT);
    }
}

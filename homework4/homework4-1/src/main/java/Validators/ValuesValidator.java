package Validators;

public class ValuesValidator {
    public boolean isValid(String value){
        try{
            double parsedValue = Double.parseDouble(value);
        }catch (NumberFormatException e){
            return false;
        }

        return true;
    }
}

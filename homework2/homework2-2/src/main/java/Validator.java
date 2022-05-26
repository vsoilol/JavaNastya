public class Validator {
    public boolean isValid(String[] values){
        try{
            int parsedValue1 = Integer.parseInt(values[0]);
            int parsedValue2 = Integer.parseInt(values[1]);
            int parsedValue3 = Integer.parseInt(values[2]);
        }catch (NumberFormatException e){
            return false;
        }

        return true;
    }

    public boolean isCorrect(String[] values){
        if(Integer.parseInt(values[0]) > 2 || Integer.parseInt(values[0]) < 1){
            return false;
        }
        return Integer.parseInt(values[1]) <= 3 && Integer.parseInt(values[1]) >= 1;
    }
}

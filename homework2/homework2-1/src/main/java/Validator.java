public class Validator {
    public boolean isValid(String[] values){
        try{
            int parsedValue1 = Integer.parseInt(values[0]);
            int parsedValue2 = Integer.parseInt(values[1]);
            double parsedValue3 = Double.parseDouble(values[2]);
            double parsedValue4 = Double.parseDouble(values[3]);
        }catch (NumberFormatException e){
            return false;
        }

        return true;
    }

    public boolean isCorrect(String[] values){
        return Double.parseDouble(values[2]) + Double.parseDouble(values[3]) != 0 && Integer.parseInt(values[1]) != 0;
    }
}

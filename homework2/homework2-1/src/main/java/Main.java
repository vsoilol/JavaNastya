import Resources.ExceptionMessages;
import Resources.UIResources;

public class Main {
    public static void main(String[] args){
        Validator validator = new Validator();

        if(validator.isValid(args) && validator.isCorrect(args)){
            System.out.print(UIResources.VALUE_IS);
            System.out.print(ExpressionCalculator.calculate(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Double.parseDouble(args[2]), Double.parseDouble(args[3])));
        }
        else{
            System.out.print(ExceptionMessages.PARAMETERS_ARE_INCORRECT);
        }
    }
}

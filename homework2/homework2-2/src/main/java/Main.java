import Resources.ExceptionMessages;

public class Main {
    public static void main(String[] args){
        OperationHandler operationHandler = new OperationHandler();
        Validator validator = new Validator();

        if(validator.isValid(args) && validator.isCorrect(args)){
            operationHandler.operationTypeHandler(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]));
        }
        else{
            System.out.print(ExceptionMessages.INVALID_PARAMS);
        }
    }
}

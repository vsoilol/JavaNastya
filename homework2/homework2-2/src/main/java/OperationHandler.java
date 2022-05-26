import Resources.UIResources;

public class OperationHandler {
    private final FactorialCycles factorialCycles = new FactorialCycles();
    private final FibonacciCycles fibonacciCycles = new FibonacciCycles();

    public void operationTypeHandler(int operationType, int cycleType, int value){
        if(operationType == 1){
            factorialCycleHandler(cycleType, value);
        }
        if(operationType == 2){
            fibonacciCycleHandler(cycleType, value);
        }
    }

    public void factorialCycleHandler(int cycleType, int value) {
        int factorialValue = 0;
        if (cycleType == 1) {
            factorialValue = factorialCycles.getFactorialValueWithWhile(value);
        }
        if (cycleType == 2) {
            factorialValue = factorialCycles.getFactorialValueWithDoWhile(value);
        }
        if (cycleType == 3) {
            factorialValue = factorialCycles.getFactorialValueWithFor(value);
        }

        System.out.print(UIResources.FACTORIAL_VALUE);
        System.out.print(factorialValue);
    }

    public void fibonacciCycleHandler(int cycleType, int countOfNumbers){
        System.out.print(UIResources.FIBONACCI_ROW);
        if(cycleType == 1){
            System.out.print(fibonacciCycles.getFibonacciRowWithWhile(countOfNumbers));
        }
        if(cycleType == 2){
            System.out.print(fibonacciCycles.getFibonacciRowWithDoWhile(countOfNumbers));
        }
        if(cycleType == 3){
            System.out.print(fibonacciCycles.getFibonacciRowWithFor(countOfNumbers));
        }
    }
}

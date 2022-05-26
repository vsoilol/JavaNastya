public class FibonacciCycles {
    public String getFibonacciRowWithWhile(int countOfNumbers) {
        int num1 = 0;
        int num2 = 1;

        int counter = 0;

        StringBuilder fibonacciRow = new StringBuilder();

        while (counter < countOfNumbers) {
            fibonacciRow.append(num1).append(" ");

            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }

        return fibonacciRow.toString();
    }

    public String getFibonacciRowWithDoWhile(int countOfNumbers) {
        int num1 = 0;
        int num2 = 1;

        int counter = 0;

        StringBuilder fibonacciRow = new StringBuilder();

        do {
            fibonacciRow.append(num1).append(" ");

            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
        while (counter < countOfNumbers);

        return fibonacciRow.toString();
    }

    public String getFibonacciRowWithFor(int countOfNumbers){
        int num1 = 0;
        int num2 = 1;

        StringBuilder fibonacciRow = new StringBuilder();

        for(int counter = 0;counter < countOfNumbers; counter++){
            fibonacciRow.append(num1).append(" ");

            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
        }

        return fibonacciRow.toString();
    }
}

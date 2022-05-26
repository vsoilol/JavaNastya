public class FactorialCycles {
    public int getFactorialValueWithWhile(int value){
        int result = 1;
        int counter = 1;

        while(counter <= value){
            result*=counter;
            counter++;
        }

        return result;
    }

    public int getFactorialValueWithDoWhile(int value){
        int result = 1;
        int counter = 1;

        do{
            result *= counter;
            counter++;
        }while(counter <= value);

        return result;
    }

    public int getFactorialValueWithFor(int value){
        int result = 1;

        for(int counter = 1;counter <= value;counter++){
            result *= counter;
        }

        return result;
    }
}

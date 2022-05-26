public class ExpressionCalculator {
    public static double calculate(int a, int p, double m1, double m2){
        return 4 * Math.pow(Math.PI, 2) * Math.pow(a, 3) / (Math.pow(p, 2 ) * (m1 + m2));
    }
}

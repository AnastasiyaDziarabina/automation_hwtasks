package homework.calculator;

public class Calculator {

    public Calculator() {
    }

    public double summarize(double a, double b) {

        double result = a + b;
        System.out.println("Sum result: " + result);

        return result;
    }

    public double subtraction(double a, double b) {
        double result = a - b;
        System.out.println("Subtraction result " + result);

        return result;
    }

    public double multiplication(double a, double b) {

        double result = a * b;
        System.out.println("Multiplication result: " + result);

        return result;
    }

    public double division(double a, double b) {

        double result = a / b;
        System.out.println("Division result: " + result);

        return result;
    }

    public double square_root(double a) {

        double result = Math.sqrt(a);
        System.out.println("a =  " + result);

        return result;
    }
}
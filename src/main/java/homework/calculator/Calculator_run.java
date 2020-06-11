package homework.calculator;

public class Calculator_run {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        calculator.summarize(3, 1.3);
        calculator.subtraction(66, 17);
        calculator.multiplication(3.3, 4);
        calculator.division(16, 8);
        calculator.square_root(9);
    }
}
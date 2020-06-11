package homework_test.hw1;

import homework.calculator.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

    public class TestCalculator {

        private Calculator calculator;

        @BeforeClass
        public void start() {
            calculator = new Calculator();
            System.out.println("Run Calculator");
        }

        @Test
        public void summarize_3_1n3() {

            double expectedResult = 4.3;
            double actualResult = calculator.summarize(3, 1.3);
            Assert.assertEquals(expectedResult, actualResult);

        }

        @Test
        public void subtraction_66_17(){

            double expectedResult = 49;
            double actualResult = calculator.subtraction(66, 17);
            Assert.assertEquals(expectedResult, actualResult);

        }

        @Test
        public void multiplication_3n3_4(){

            double expectedResult = 13.2;
            double actualResult = calculator.multiplication(3.3, 4);
            Assert.assertEquals(expectedResult, actualResult);

        }

        @Test
        public void division_16_8() {

            double expectedResult = 2;
            double actualResult = calculator.division(16, 8);
            Assert.assertEquals(expectedResult, actualResult);

        }

        @Test
        public void square_root(){

            double expectedResult = 3;
            double actualResult = calculator.square_root(9);
            Assert.assertEquals(expectedResult, actualResult);

        }
    }
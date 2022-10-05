package week3_day2.dependency_injection;

public class CalculatorTest {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new RandomNumberGenerator();
        NumberGenerator numberGenerator1 = new SpecificNumberGenerator();

        Calculator randomCalculator = new Calculator(numberGenerator);
        randomCalculator.plus(10);

        Calculator specificCalculator = new Calculator(numberGenerator1);
        specificCalculator.plus(20);
    }
}

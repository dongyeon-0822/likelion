package week3.day2.calculator_1;

public class RandomCalculatorTest {
    public static void main(String[] args) {
        RandomNumber rn = new RandomNumber();
        RandomCalculator c = new RandomCalculator(2, rn);
        c.plus();
        c.minus();
        c.multiple();
        c.divide();
    }
}

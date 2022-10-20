package week3.day2.dependency_injection;

public class Calculator {
    NumberGenerator numberGenerator;

    public Calculator(NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
    }

    public void plus(int n) {
        System.out.println(10 + numberGenerator.generate(n));
    }
}

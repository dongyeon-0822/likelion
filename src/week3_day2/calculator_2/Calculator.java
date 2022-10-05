package week3_day2.calculator_2;

public class Calculator {
    NumberCreator numbercreator;
    private int baseNum;
    public Calculator(NumberCreator numbercreator) {
        this.numbercreator = numbercreator;
        this.baseNum = 10;
    }
    // 생성자 오버로딩
    public Calculator(NumberCreator numbercreator, int baseNum) {
        this.numbercreator = numbercreator;
        this.baseNum = baseNum;
    }

    void plus(int num) {
        System.out.println(num + numbercreator.create(10));
    }
}

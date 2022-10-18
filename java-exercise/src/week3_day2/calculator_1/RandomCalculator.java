package week3_day2.calculator_1;

public class RandomCalculator {
    private int a;
    private RandomNumber rn;
    public RandomCalculator(int a, RandomNumber rn) {
        this.a = a;
        this.rn = rn;
    }

    public void plus() {
        System.out.println(a+rn.getRandomNumber());
    }
    public void minus(){
        System.out.println(a-rn.getRandomNumber());
    }
    public void multiple(){
        System.out.println(a* rn.getRandomNumber());
    }
    public void divide(){
        // error 가 발생하지 않고 Infinity 가 출력됨
//        try {
//            System.out.println((double) a / rn.getRandomNumber());
//        } catch (Exception e) {
//            System.out.println("랜덤생성 숫자가 0입니다.");
//        }
        if (rn.getRandomNumber() == 0) {
            System.out.println("랜덤생성 숫자가 0입니다.");
        } else {
            System.out.println((double) a / rn.getRandomNumber());
        }
    }
}

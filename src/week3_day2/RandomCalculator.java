package week3_day2;

public class RandomCalculator {
    private int a;
    private int b;
    public RandomCalculator(int a) {
        this.a = a;
        RandomNumber rn = new RandomNumber();
        this.b = rn.getRandomNumber();
    }

    public void plus() {
        System.out.println(a+b);
    }
    public void minus(){
        System.out.println(a-b);
    }
    public void multiple(){
        System.out.println(a*b);
    }
    public void divide(){
        // error 가 발생하지 않고 Infinity 가 출력됨
//        try {
//            System.out.println((double) a / b);
//        } catch (Exception e) {
//            System.out.println("랜덤생성 숫자가 0입니다.");
//        }
        if (b == 0) {
            System.out.println("랜덤생성 숫자가 0입니다.");
        } else {
            System.out.println((double) a / b);
        }
    }
}

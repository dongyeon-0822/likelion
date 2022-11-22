package week10.day1;

public class RecursivePractice {
    public static int print100(int n) {
        if (n > 100) {
            return 0;
        }
        System.out.println(n);
        return print100(n+1);
    }
    public static void main(String[] args) {
        print100(1);
    }
}

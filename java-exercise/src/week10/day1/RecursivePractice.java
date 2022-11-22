package week10.day1;

public class RecursivePractice {
    public static int sum = 0;
    public static void print100(int n) {
        if (n > 100) return;
        sum += n;
        print100(n+1);
    }
    public static void main(String[] args) {
        print100(1);
        System.out.println(sum);
    }
}

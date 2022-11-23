package week10.day2;

import java.util.Scanner;

public class CodeUp_1853 {
    public static int sum(int n) {
        if (n < 1) return 0;
        return n + sum(n-1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(sum(n));
    }
}

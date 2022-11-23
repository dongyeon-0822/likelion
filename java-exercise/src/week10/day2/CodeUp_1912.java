package week10.day2;

import java.util.Scanner;

public class CodeUp_1912 {
    public static int factorial(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(factorial(n));
    }
}

package week10.day2;

import java.util.Scanner;

public class CodeUp_1855 {
    public static int fibonacci(int n) {
        if(n <= 2) return 1;
        return fibonacci(n-2)+fibonacci(n-1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fibonacci(n));
    }
}

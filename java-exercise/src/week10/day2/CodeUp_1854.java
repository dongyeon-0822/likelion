package week10.day2;

import java.util.Scanner;

public class CodeUp_1854 {
    public static Long sumOf(Long n) {
        if (n <= 0) return 0l;
        return n%10 + sumOf(n/10);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Long n = scanner.nextLong();
        System.out.println(sumOf(n));
    }
}

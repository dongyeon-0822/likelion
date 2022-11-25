package week10.day4;

import java.util.Scanner;

public class CodeUp_2623 {
    static int gcd2(int a, int b) {
        while (a != b) {
            if (a > b)
                a = a-b;
            else
                b = b-a;
        }
        return a;
    }

    static int gcd(int a, int b) {
        if (a == b) {
            return a;
        } else if (a > b) {
            return gcd(a - b, b);
        } else {
            return gcd(b - a, a);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(gcd(a, b));
        System.out.println(gcd2(a, b));
    }
}

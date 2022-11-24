package week10.day3;

import java.util.Scanner;

public class CodeUp_1904 {
    static void printOdd(int a, int b) {
        if (a > b) return;
        if (a % 2 == 1) {
            System.out.print(a + " ");
            printOdd(a + 2, b);
        } else {
            printOdd(a + 1, b);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        printOdd(a, b);
    }
}

package week10.day3;

import java.util.Scanner;

public class CodeUp_1860 {
    static void printNum(int n) {
        if (n<=0) return;
        printNum(n-1);
        System.out.print(n+ " ");
    }
    static void printLine(int n) {
        if (n<=0) return;
        printLine(n-1);
        printNum(n);
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printLine(n);
    }
}

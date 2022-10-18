package week5_day2.algorithm;

import java.util.Scanner;

public class RecursiveStar {
    private int height;

    public RecursiveStar(int height) {
        this.height = height;
    }
    public void printLine(int n) {
        if (n == 0) {
            return;
        }
        printLine(n-1);
        System.out.print("*");
    }
    public void printStar(int n) {
        if (n == 0) {
            return;
        }
        printStar(n-1);
        printLine(n);
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        RecursiveStar rs = new RecursiveStar(n);
        rs.printStar(n);
    }
}

package week5.day2.codeUp;

import java.util.Scanner;

public class RecursiveStar_1859 {
    private int height;

    public RecursiveStar_1859(int height) {
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

        RecursiveStar_1859 rs = new RecursiveStar_1859(n);
        rs.printStar(n);
    }
}

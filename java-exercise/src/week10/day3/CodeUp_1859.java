package week10.day3;

import java.util.Scanner;

public class CodeUp_1859 {
    private int height;

    public CodeUp_1859(int height) {
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

        CodeUp_1859 rs = new CodeUp_1859(n);
        rs.printStar(n);
    }
}

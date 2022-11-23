package week10.day2;

import java.util.Scanner;

// 재귀로 * n개 한줄로 출력하기
public class CodeUp_1851 {
    public static void printStar(int n) {
        if (n<=0) return;
        System.out.print("*");
        printStar(n-1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printStar(n);
    }
}

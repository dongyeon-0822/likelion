package week5_day1.algorithm;

import java.util.Scanner;

public class Diamond {
    private char c;
    public Diamond() {
        this.c = '*';
    }
    public Diamond(char c) {
        this.c = c;
    }

    public void printDiamond(int n) {
        for (int i = 0; i < n; i++) { //마름모 상단
            for (int j = 0; j < n-i-1; j++)
                System.out.print(" ");
            for (int j = 0; j < i * 2 + 1; j++)
                System.out.print(c);
            System.out.println();
        }
        for (int i = 0; i < n - 1; i++) { //마름모 하단
            for (int j = 0; j <= i; j++)
                System.out.print(" ");
            for (int j = 0; j < (n-i-1) * 2 - 1; j++)
                System.out.print(c);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char c = sc.next().charAt(0);

        Diamond dm = new Diamond(c);
        dm.printDiamond(n);
    }
}

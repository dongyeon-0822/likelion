package week5.day1;

import java.util.Scanner;

public class Pyramid {
    private char c;
    public Pyramid() {
        this.c = '*';
    }

    public Pyramid(char c) {
        this.c = c;
    }

    public void printPyramid(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++)
                System.out.print(" ");
            for (int j = 0; j < i * 2 + 1; j++)
                System.out.print("*");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char c = sc.next().charAt(0);

        Pyramid p = new Pyramid(c);
        p.printPyramid(4);
    }
}

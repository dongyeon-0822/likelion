package week5.day2;

import java.util.Scanner;

public class Square {
    private int n;

    public Square(int n) {
        this.n = n;
    }

    public void printSquare() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Square sq = new Square(n);
        sq.printSquare();
    }
}

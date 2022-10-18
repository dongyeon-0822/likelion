package week5_day2.algorithm;

import java.util.Scanner;

public class Rectangle {
    private int base;
    private int height;

    public Rectangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public void printRectangle() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int height = sc.nextInt();

        Rectangle r = new Rectangle(base,height);
        r.printRectangle();
    }
}

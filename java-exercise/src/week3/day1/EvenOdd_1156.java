package week3.day1;

import java.util.Scanner;

public class EvenOdd_1156 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if (input % 2 == 0){
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
    }
}

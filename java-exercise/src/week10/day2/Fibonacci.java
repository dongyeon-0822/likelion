package week10.day2;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        List<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(1);
        fibonacci.add(1);
        for (int i = 2; i < n; i++) {
            fibonacci.add(fibonacci.get(i - 1) + fibonacci.get(i - 2));
        }
        System.out.println(fibonacci);
    }
}

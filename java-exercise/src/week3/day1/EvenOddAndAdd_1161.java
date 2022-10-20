package week3.day1;

import java.util.Scanner;

public class EvenOddAndAdd_1161 {
    public static String EvenOdd(int n){
        if (n%2==0){
            return "짝수";
        }
        else
            return "홀수";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(EvenOdd(a) +"+"+ EvenOdd(b)+"="+ EvenOdd(a+b));
    }
}

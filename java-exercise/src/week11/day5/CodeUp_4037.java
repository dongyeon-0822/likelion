package week11.day5;

import java.util.Arrays;
import java.util.Scanner;

public class CodeUp_4037 {

    static int[] isPrime(int n) {
        int[] array = new int[n+1];
        for (int i = 2; i < (int) Math.sqrt(n) + 1; i++) {
            if (array[i] == 0) {
                int j = 2;
                while (i * j <= n) {
                    array[i*j] = 1;
                    j++;
                }
            }
        }
        return array;
    }
    static void findPrimeFactor(int[] array, int n) {
        int d = 2;
        while (d <= n) {
            if (n % d == 0) {
                n /= d;
                System.out.print(d + " ");
            } else {
                while (array[++d] != 0){}
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = isPrime(n);
//        System.out.println(Arrays.toString(array));
        findPrimeFactor(array, n);
    }
}

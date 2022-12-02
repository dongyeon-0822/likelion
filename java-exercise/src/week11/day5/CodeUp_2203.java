package week11.day5;

import java.util.Scanner;

public class CodeUp_2203 {
    static boolean isPrime(Long n) {
        for (int i = 2; i *i <= n; i++)
            if (n % i == 0)
                return false;
        return true;
    }
    static void findMaxPrimeFactor(Long n) {
        Long max = n;
        for (Long i = 2l; i*i <= n; i++) {
            if (n % i == 0) {
                if (isPrime(i))
                    max = i;
                if (isPrime(n/i))
                    max = n/i;
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        findMaxPrimeFactor(n);
    }
}

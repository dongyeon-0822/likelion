package week7.day2;

import java.util.HashSet;
import java.util.Set;

public class FindPrime {
    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 0; i <= n/i; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public int solution(String numbers) {
        int answer = 0;
        Set<Character> set = new HashSet<>();
        for (char c : numbers.toCharArray()) {
            set.add(c);
        }


        return answer;
    }
}

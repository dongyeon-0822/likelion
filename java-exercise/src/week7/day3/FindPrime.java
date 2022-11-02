package week7.day3;

import java.util.HashSet;
import java.util.Set;

public class FindPrime {
    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n/i; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void swap(char[] arr, int depth, int i) {
        char temp = arr[depth];
        arr[depth] = arr[i];
        arr[i] = temp;
    }
    public void permutation(Set<Integer> set, char[] arr, int depth, int n, int r) {
        if (depth == r) {
            String tmp = String.valueOf(arr).substring(0,r);
            set.add(Integer.parseInt(tmp));
            return;
        }

        for (int i = depth; i < n; i++) {
            swap(arr, depth, i);
            permutation(set, arr, depth + 1, n, r);
            swap(arr, depth, i);
        }
    }

    public int solution(String numbers) {
        int answer = 0;

        char[] numbers_arr = numbers.toCharArray();
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i <= numbers.length(); i++) {
            permutation(set, numbers_arr, 0,numbers.length(),i);
        }
        for (Integer s : set) {
            if (isPrime(s)) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        FindPrime findPrime = new FindPrime();
        System.out.println(findPrime.solution("011"));
    }
}

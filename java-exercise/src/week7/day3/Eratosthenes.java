package week7.day3;

import java.util.Arrays;

public class Eratosthenes {
    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[n+1];
        Arrays.fill(arr,1);
        arr[0] = 0;
        arr[1] = 0;

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] == 1) {
                answer++;
                for (int j = i*2; j < arr.length; j += i) {
                    arr[j] = 0;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Eratosthenes eratosthenes = new Eratosthenes();
        System.out.println(eratosthenes.solution(10));
    }
}

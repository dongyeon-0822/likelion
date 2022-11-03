package week7.day4;

import java.util.Arrays;

public class Eratosthenes {
    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[n+1]; // 0부터 n까지 배열 만들기
        Arrays.fill(arr,1); // 1로 초기화 : True로 초기회
        arr[0] = 0; // 0은 소수가 아님
        arr[1] = 0; // 1은 소수가 아님

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] == 1) { // 소수라면
                answer++; // count 해주고
                for (int j = i*2; j < arr.length; j += i) { //해당 소수의 배수는 0으로 바꾼다.
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

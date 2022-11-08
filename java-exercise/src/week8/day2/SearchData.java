package week8.day2;

import java.util.Scanner;

public class SearchData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();

        int answer = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == k) {
                answer = i+1;
                break;
            }
        }
        System.out.println(answer);
    }
}

package week8.day2;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int target = scanner.nextInt();
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        int answer = -1; // 찾았다면 인덱스, 못 찾았다면 -1 반환
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            // 중간값 찾기
            int mid = (int) ((start + end) / 2);
            // 같은지 비교하기
            if (nums[mid] == target) {
                answer = mid;
                break;
            } else if (nums[mid] > target) { // 인덱스(시작점, 끝점) 옮기기
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        System.out.println(answer);
    }
}

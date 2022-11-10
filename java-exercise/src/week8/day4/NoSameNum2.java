package week8.day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NoSameNum2 {
    public int[] solution(int []arr) {
        List<Integer> tmp_arr = new ArrayList<>();

        int tmp = arr[0];
        tmp_arr.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (tmp != arr[i]) {
                tmp_arr.add(arr[i]);
                tmp = arr[i];
            }
        }
        int[] answer = tmp_arr.stream()
                .mapToInt(i -> i)
                .toArray();

        return answer;
    }

    public static void main(String[] args) {
        NoSameNum2 noSameNum2 =  new NoSameNum2();
        int[] answer = noSameNum2.solution(new int[]{1, 1, 3, 3, 0, 1, 1});
        System.out.println(Arrays.toString(answer));
    }
}

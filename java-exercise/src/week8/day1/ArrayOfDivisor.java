package week8.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayOfDivisor {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        List<Integer> tmp = new ArrayList<>();
        for (int i : arr) {
            if (i % divisor == 0) {
                tmp.add(i);
            }
        }
        Collections.sort(tmp);
        answer = tmp.stream()
                .mapToInt(i -> i)
                .toArray();
        if (answer.length == 0) {
            answer = new int[]{-1};
        }
        return answer;
    }
}

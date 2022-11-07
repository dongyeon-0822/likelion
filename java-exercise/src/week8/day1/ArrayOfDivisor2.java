package week8.day1;

import java.util.PriorityQueue;

public class ArrayOfDivisor2 {
    public int[] solution(int[] arr, int divisor) {
        PriorityQueue<Integer> tmp = new PriorityQueue<>();
        for (int i : arr) {
            if (i % divisor == 0) {
                tmp.add(i);
            }
        }
        if(tmp.size() == 0)
            return new int[]{-1};

        int[] answer = new int[tmp.size()];
        int idx = 0;
        while(!tmp.isEmpty()){
            answer[idx++] = tmp.poll();
        }
        return answer;
    }
}
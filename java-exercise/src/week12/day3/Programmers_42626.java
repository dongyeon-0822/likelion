package week12.day3;

import java.util.PriorityQueue;

public class Programmers_42626 {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> priorityQueueLowest = new PriorityQueue<>();
        for (int i = 0; i < scoville.length; i++) {
            priorityQueueLowest.add(scoville[i]);
        }
        while (priorityQueueLowest.peek() < K) {
            if (priorityQueueLowest.size() == 1) {
                return -1;
            }
            int sco = 0;
            sco+=priorityQueueLowest.remove();
            sco += priorityQueueLowest.remove()*2;
            priorityQueueLowest.add(sco);
            answer ++;
        }

        return answer;
    }
}

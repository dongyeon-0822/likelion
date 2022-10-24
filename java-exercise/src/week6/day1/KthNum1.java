package week6.day1;

import java.util.PriorityQueue;

public class KthNum1 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i< commands.length;i++) {
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
            for (int j = commands[i][0]-1; j < commands[i][1]; j++) {
                priorityQueue.add(array[j]);
            }
            for (int j = 0; j < commands[i][2]; j++) {
                answer[i] = priorityQueue.poll();
            }
        }
        return answer;
    }
}

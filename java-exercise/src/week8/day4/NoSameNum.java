package week8.day4;

import java.util.Stack;

public class NoSameNum {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        int cnt = 0;
        for (int i : arr) {
            if (stack.empty() || stack.peek() != i)
                stack.push(i);
        }
        int[] answer = new int[stack.size()];
        for (int i = answer.length-1; i >= 0; i--) {
            answer[i] = stack.pop();
        }
        return answer;
    }
}

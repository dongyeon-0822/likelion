package week5.day5;

import java.util.Stack;

public class CorrectParenthesis {
    boolean solution(String s) {
        boolean answer = false;

        Stack<Character> stack = new Stack<>();
        char[] str = s.toCharArray();
        if (str[0] == ')') {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (stack.size() == 0) {
                stack.push(str[i]);
            } else {
                if (stack.peek() == '(' && str[i] == ')') {
                    stack.pop();
                } else {
                    stack.push(str[i]);
                }
            }
        }
        if (stack.size() == 0) {
            answer = true;
        }
        return answer;
    }
}

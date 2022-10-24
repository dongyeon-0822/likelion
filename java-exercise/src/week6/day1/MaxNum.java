package week6.day1;

import java.util.*;

class MyComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        return -(Integer.parseInt(a + b)- Integer.parseInt(b + a));
    }
}

public class MaxNum {
    public String solution(int[] numbers) {
        String answer = "";
        List<String> tmp = new ArrayList<>();
        for (int number : numbers) {
            tmp.add(Integer.toString(number));
        }
        Collections.sort(tmp,new MyComparator());

        StringBuilder sb = new StringBuilder();
        for (String s : tmp) {
            sb.append(s);
        }
        answer = sb.toString();
        if (answer.charAt(0) == '0') {
            return "0";
        } else {
            return answer;
        }
    }
}

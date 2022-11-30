package week11.day3;

public class Programmers_12916 {
    boolean solution(String s) {
        boolean answer = true;

        int p = 0;
        int y = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='P' || s.charAt(i)=='p')
                p++;
            else if (s.charAt(i)=='Y' || s.charAt(i)=='y')
                y++;
        }
        if (p==y)
            answer=true;
        else
            answer=false;
        return answer;
    }
}
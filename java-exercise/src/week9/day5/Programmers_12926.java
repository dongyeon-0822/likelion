package week9.day5;

public class Programmers_12926 {
    public String solution(String s, int n) {
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            int c = (int)s.charAt(i);

            if (c == (int) ' ')
                answer+= " ";
            else if (c >= (int) 'a' && c <= (int) 'z')
                answer += (char)((c + n - (int)'a')%26+(int)'a');
            else
                answer += (char)((c + n - (int)'A')%26+(int)'A');

        }
        return answer;
    }
}

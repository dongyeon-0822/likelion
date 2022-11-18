package week9.day5;

public class Programmers_12926 {
    public String solution(String s, int n) {
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i);

            if (c == ' ')
                answer+= " ";
            else if (c >= 'a' && c <= 'z')
                answer += (char)((c + n - 'a')%26+'a');
            else
                answer += (char)((c + n - 'A')%26+'A');

        }
        return answer;
    }
}

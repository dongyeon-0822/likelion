package week4_day1.algorithm;

public class Problem1 {
    public int solution_1(int n) {
        int answer = 0;

        String s = Integer.toString(n);
        for (char c : s.toCharArray()){
            answer += (c - '0');
        }

        return answer;
    }
    public int solution_2(int n)
    {
        int answer = 0;

        while (n != 0) {
            answer += n % 10;
            n /= 10;
        }

        return answer;
    }
}

package week8.day1;


public class Hashard {
    public boolean solution(int x) {
        int org = x;
        int sum = 0;

        while (x > 0) {
            sum += (x%10);
            x /= 10;
        }
        if (org % sum == 0) return true;
        else return false;
    }
}

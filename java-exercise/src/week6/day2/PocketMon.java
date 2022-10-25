package week6.day2;

import java.util.*;

public class PocketMon {
    public int solution(int[] nums) {
        int answer = 0;
        int size = nums.length / 2;

        Set<Integer> s = new HashSet<>();
        for (int num : nums) {
            s.add(num);
        }

        if (size <= s.size())
            answer = size;
        else
            answer = s.size();

        return answer;
    }
}

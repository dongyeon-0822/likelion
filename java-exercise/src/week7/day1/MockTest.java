package week7.day1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MockTest {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] stu1 = {1,2,3,4,5};
        int[] stu2 = {2,1,2,3,2,4,2,5};
        int[] stu3 = {3,3,1,1,2,2,4,4,5,5};
        int[] cnt = {0,0,0};

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == stu1[i % stu1.length]) {
                cnt[0] += 1;
            }
            if (answers[i] == stu2[i % stu2.length]) {
                cnt[1] += 1;
            }
            if (answers[i] == stu3[i % stu3.length]) {
                cnt[2] += 1;
            }
        }

        int max_cnt = (cnt[0]> cnt[1]) ? cnt[0] : cnt[1];
        max_cnt = (max_cnt> cnt[2]) ? max_cnt : cnt[2];

        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i <3; i++) {
            if (cnt[i] == max_cnt)
                arr.add(i+1);
        }

        answer = new int[arr.size()];
        for (int i = 0 ; i < arr.size() ; i++)
            answer[i] = arr.get(i).intValue();
        return answer;
    }
}

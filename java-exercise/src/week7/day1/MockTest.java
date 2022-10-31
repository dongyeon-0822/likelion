package week7.day1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MockTest {
    public int[] solution(int[] answers) {
        List<Integer> list = new ArrayList<>();
        int[] stu1 = {1,2,3,4,5};
        int[] stu2 = {2,1,2,3,2,4,2,5};
        int[] stu3 = {3,3,1,1,2,2,4,4,5,5};
        int[] cnt = {0,0,0};

        for (int i = 0; i < answers.length; i++) {
            if (stu1[i] == answers[i % stu1.length]) {
                cnt[0] += 1;
            }
            if (stu2[i] == answers[i % stu2.length]) {
                cnt[1] += 1;
            }
            if (stu3[i] == answers[i % stu3.length]) {
                cnt[2] += 1;
            }
        }
        Arrays.sort(cnt);
        int max_cnt = cnt[2];

        for (int i = 0; i <cnt.length; i++) {
            if (cnt[i] == max_cnt) {
                list.add(i+1);
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0 ; i < list.size() ; i++) {
            answer[i] = list.get(i).intValue();
        }

        return answer;
    }
}

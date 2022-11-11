package week8.day5;

import java.util.ArrayList;
import java.util.List;

public class SecretMap {
    public String toBinary(int n) {
        List<Integer> binary_rev = new ArrayList<>();
        while (n != 0) {
            binary_rev.add(n%2);
            n/=2;
        }
        String binary = "";
        for (int i = binary_rev.size()-1; i >=0 ; i--) {
            binary += Integer.toString(binary_rev.get(i));
        }
        return binary;
    }
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};

        for (int i = 0; i < arr1.length; i++) {
            String s1 = Integer.toBinaryString(arr1[i]);
            String s2 = Integer.toBinaryString(arr2[i]);
            String tmp1 = "", tmp2 = "";
            for (int j = 0; j < n-s1.length(); j++)
                tmp1 += "0";
            for (int j = 0; j < n-s2.length(); j++)
                tmp2 += "0";
            tmp1+=s1;
            tmp2+=s2;
            for (int j = 0; j <n; j++) {
//                if (Integer.parseInt(tmp1.charAt(j)) || tmp2.charAt(j)) {
//
//                }
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        SecretMap secretMap = new SecretMap();
        secretMap.solution(3, new int[]{1, 2, 3}, new int[]{4, 5, 6});
    }
}

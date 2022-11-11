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
    public String toBinaryFormat(int size, int n) {
        String binary = "";
        List<Integer> binary_rev = new ArrayList<>();
        while (n != 0) {
            binary_rev.add(n%2);
            n/=2;
        }
        for (int i = binary_rev.size()-1; i >=0 ; i--) {
            binary += Integer.toString(binary_rev.get(i));
        }
        return String.format("%" + size + "s", binary).replaceAll(" ", "0");
    }
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};
        List<String> tmp_arr = new ArrayList<>();
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
            String tmp = "";
            for (int j = 0; j < n; j++) {
                if (tmp1.charAt(j)=='1' || tmp2.charAt(j)=='1')
                    tmp+="#";
                else
                    tmp+=" ";
            }
            tmp_arr.add(tmp);
        }
        answer = tmp_arr.toArray(new String[tmp_arr.size()]);
        return answer;
    }

    public static void main(String[] args) {
        SecretMap secretMap = new SecretMap();
        secretMap.solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28});
    }
}

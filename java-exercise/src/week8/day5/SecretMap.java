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
//    public String[] solution(int n, int[] arr1, int[] arr2) {
//        String[] answer = {};
//        List<String> tmp_arr = new ArrayList<>();
//        for (int i = 0; i < arr1.length; i++) {
//            String tmp1 = toBinaryFormat(n, arr1[i]);
//            String tmp2 = toBinaryFormat(n, arr2[i]);
//            String tmp = "";
//            for (int j = 0; j < n; j++) {
//                if (tmp1.charAt(j)=='1' || tmp2.charAt(j)=='1')
//                    tmp+="#";
//                else
//                    tmp+=" ";
//            }
//            tmp_arr.add(tmp);
//        }
//        answer = tmp_arr.toArray(new String[tmp_arr.size()]);
//        return answer;
//    }
    public String[] solution(int n, int[] arr1, int[] arr2) {
        var answer = new String[n];
        for (int i = 0; i < n; i++) {
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i])
                    .replace("1","#").replace("0", " ");
            answer[i] = " ".repeat(n - answer[i].length()) + answer[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        SecretMap secretMap = new SecretMap();
        secretMap.solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28});
    }
}

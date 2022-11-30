package week11.day2;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 4, 5, 9, 1, 0};

        int[] radixArr = new int[10];
        Arrays.fill(radixArr, -1); // -1로 채우기

        for (var i : arr)
            radixArr[i] = i;

        System.out.println(Arrays.toString(radixArr));

        int cnt = 0;
        for (int i = 0; i < radixArr.length; i++) {
            if(radixArr[i] != -1) {
                arr[cnt++] = radixArr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

package week9.day4;

import java.util.Arrays;

public class QuickSort2 {
    public int[] quickSort(int[] arr, int start, int end) {
        int pivot = arr[(start+end)/2]; // pivot 뽑기
        int leftIdx = start;
        int rightIdx = end;
        while (leftIdx <= rightIdx) {
            while (arr[leftIdx] < pivot)
                leftIdx++;
            while (arr[rightIdx] > pivot)
                rightIdx--;
            if (leftIdx <= rightIdx) {
                int tmp = arr[leftIdx];
                arr[leftIdx] = arr[rightIdx];
                arr[rightIdx] = tmp;
                leftIdx++;
                rightIdx--;
            }
        }
        if (start<rightIdx) quickSort(arr,start,rightIdx);
        if (leftIdx<end) quickSort(arr,leftIdx,end);
        return arr;
    }
    public static void main(String[] args) {
        int[] arr =  arr = new int[]{20, 18, 5, 19, 40, 50, 52, 25};
        QuickSort2 quickSort2 = new QuickSort2();
        int[] new_arr = quickSort2.quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(new_arr));
    }
}

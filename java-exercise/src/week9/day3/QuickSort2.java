package week9.day3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class QuickSort2 {
    public void quickSort(int[] arr) {
        int pivot = arr[arr.length/2]; //pivot 뽑기
        int leftIdx = 0;
        int rightIdx = arr.length-1;
        while (arr[leftIdx] < pivot)
            leftIdx++;
        while (arr[leftIdx] > pivot)
            rightIdx--;
        if (leftIdx <= rightIdx) {
            int tmp = arr[leftIdx];
            arr[leftIdx] = arr[rightIdx];
            arr[rightIdx] = tmp;
            leftIdx++;
            rightIdx--;
        }
    }
    public static void main(String[] args) {
        int[] arr =  arr = new int[]{20, 18, 5, 19, 40, 50, 5, 25};
    }
}

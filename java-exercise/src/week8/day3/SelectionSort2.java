package week8.day3;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;

interface StatementStrategy {
    boolean apply(int a, int b);
}
public class SelectionSort2 {
    public int[] selectionSort(int[] arr, BiFunction<Integer, Integer, Boolean> stmt) {
        for (int i = 0; i < arr.length - 1; i++) {
            int swapIdx = i;
            for (int j = i; j < arr.length; j++) {
                if (stmt.apply(arr[swapIdx], arr[j])) swapIdx = j;
            }
            int temp = arr[i];
            arr[i] = arr[swapIdx];
            arr[swapIdx] = temp;
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 4, 9, 10, 223, 111, 23, 3, 39};
        SelectionSort2 selectionSort = new SelectionSort2();
        // interface 사용
        // selectionSort.selectionSort(arr, (a, b) -> a < b); // 오름차순
        // selectionSort.selectionSort(arr, (a, b) -> a > b); // 내림차순

        // Function 사용
        //Function<Integer[], Boolean> fn = (arr1) -> arr1[0] > arr1[1];
        //System.out.println(fn.apply(new Integer[]{10, 20}));

        // BiFunction 사용
        BiFunction<Integer, Integer, Boolean> biFunction = (a, b) -> a > b;
        selectionSort.selectionSort(arr, biFunction);
    }
}

package week8.day3;

import java.util.Arrays;

interface StatementStrategy {
    boolean apply(int a, int b);
}
public class SelectionSort2 {
    public int[] selectionSort(int[] arr, StatementStrategy stmt) {
        for (int i = 0; i < arr.length - 1; i++) {
            int idx = i;
            for (int j = i; j < arr.length; j++) {
                if (stmt.apply(arr[idx], arr[j]))
                    idx = j;
            }
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 4, 9, 10, 223, 111, 23, 3, 39};
        SelectionSort2 selectionSort = new SelectionSort2();
        selectionSort.selectionSort(arr, (a, b) -> a < b); // 오름차순
        selectionSort.selectionSort(arr, (a, b) -> a > b); // 내림차순
    }
}

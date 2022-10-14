package week4_day4.algorithm;

import week4_day3.algorithm.BubbleSort;

public class InsertionSort {
    public int[] insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int value = arr[i];
            int j = i-1;
            while (j >= 0 && arr[j] > value) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = value;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{7,10,5,2,24};
        InsertionSort insertionSort = new InsertionSort();

        int[] sortedArr = insertionSort.insertionSort(arr);

        for (int i : sortedArr) {
            System.out.println(i);
        }
    }
}

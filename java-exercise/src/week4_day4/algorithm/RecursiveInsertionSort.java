package week4_day4.algorithm;

public class RecursiveInsertionSort {
    // 서브 어레이 `arr[i…n]`에 삽입 어레이을 수행하는 재귀 함수
    public void recursiveInsertionSort(int[] arr, int i, int n)
    {
        int value = arr[i];
        int j = i - 1;
        while (j >= 0 && arr[j] > value)
        {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = value;
        if (i + 1 <= n) {
            recursiveInsertionSort(arr, i + 1, n);
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{7,10,5,2,24};
        RecursiveInsertionSort recursiveInsertionSort = new RecursiveInsertionSort();

        recursiveInsertionSort.recursiveInsertionSort(arr,1, arr.length - 1);

        for (int i : arr) {
            System.out.println(i);
        }
    }
}

package week4_day3.algorithm;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{7,10,5,2,24};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}

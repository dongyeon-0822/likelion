package week8.day3;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = new int[]{2, 3, 4, 9, 10, 223, 111, 23, 7, 39};

        for (int i = 0; i < arr.length - 1; i++) {
            int min_idx = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = tmp;
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}

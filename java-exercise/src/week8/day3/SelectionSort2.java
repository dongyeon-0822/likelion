package week8.day3;

public class SelectionSort2 {
    public static void main(String[] args) {
        int arr[] = new int[]{2, 3, 4, 9, 10, 223, 111, 23, 7, 39};

        for (int i = 0; i < arr.length - 1; i++) {
            int max_idx = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] > arr[max_idx]) {
                    max_idx = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[max_idx];
            arr[max_idx] = tmp;
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}

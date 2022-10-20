package week4.day2.algorithm;

public class Max {
    public int getMax(int[] arr) {
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
    public static void main(String[] args) {
        int[] arr = new int[] {3, 29, 38, 12,57, 74, 40, 85, 61};
        Max max = new Max();
        int maxNum = max.getMax(arr);
        System.out.println(maxNum);
    }
}

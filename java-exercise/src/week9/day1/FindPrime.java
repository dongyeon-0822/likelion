package week9.day1;

// 소수판별 알고리즘 : 에라토스테네스 체
public class FindPrime {
    public static void main(String[] args) {
        final int MAX_NUM = 100;

        int[] arr = new int[MAX_NUM+1];
        for (int i = 0; i <= MAX_NUM; i++) {
            arr[i] = i;
        }
        for (int i = 2; i <= MAX_NUM; i++) {
            if (arr[i] == 0) {
                continue;
            }
            for (int j = i*2; j <= MAX_NUM; j+=i) {
                arr[j] = 0;
            }
        }
    }
}

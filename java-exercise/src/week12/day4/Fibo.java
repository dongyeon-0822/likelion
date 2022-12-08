package week12.day4;

public class Fibo {
    public static int fibo(int num) {
        int[] fiboDpArray = new int[num + 1];

        fiboDpArray[0] = 0;
        fiboDpArray[1] = 1;

        if (num > 1) {
            for (int i = 2; i <= num; i++) {
                fiboDpArray[i] = fiboDpArray[i - 2] + fiboDpArray[i - 1];
            }
        }

        return fiboDpArray[num];
    }
    public static void main(String[] args) {
        System.out.println(fibo(4));
    }
}

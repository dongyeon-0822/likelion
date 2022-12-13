package week13.day2;

class Pair {
    public int left;
    public int right;

    public Pair(int left, int right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "Pair { " + left + ", " + right + " }";
    }
}

public class OptimalStrategy {
    public static void main(String[] args) {
        int[] coins = new int[]{2, 7, 40, 19};

        // 4*4 배열
        Pair[][] dp = new Pair[coins.length][coins.length];

        // 1개 있는 경우
        for (int i = 0; i < coins.length; i++)
            dp[i][i] = new Pair(coins[i], 0);

        for (int i = 0; i < coins.length - 1; i++) {
            int a = coins[i];
            int b = coins[i + 1];

            if (a <= b)
                dp[i][i+1] = new Pair(a, b);
            else
                dp[i][i+1] = new Pair(b, a);

            System.out.println(dp[i][i+1].toString());
        }
    }
}

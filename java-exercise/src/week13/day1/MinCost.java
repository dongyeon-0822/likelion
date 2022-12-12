package week13.day1;

public class MinCost {
    public static void get_min_cost(int matrix[][]) {
        int[][] dp = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == 0 && j == 0)
                    dp[i][j] = matrix[i][j];
                else if (i == 0 && j > 0)
                    dp[i][j] = dp[i][j-1] + matrix[i][j];
                else if (j == 0 && i > 0)
                    dp[i][j] = dp[i-1][j] + matrix[i][j];
                else if (i > 0 && j > 0){
                    int tmp = dp[i-1][j-1] < dp[i-1][j] ? dp[i-1][j-1] : dp[i-1][j];
                    int min_cost = tmp < dp[i][j-1] ? tmp : dp[i][j-1];
                    dp[i][j] = min_cost + matrix[i][j];
                }
            }
        }
        for (int[] ints : dp) {
            for (int anInt : ints)
                System.out.printf("%d ", anInt);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,3,2},{4,6,2},{1,2,4}};

        get_min_cost(matrix);
    }
}

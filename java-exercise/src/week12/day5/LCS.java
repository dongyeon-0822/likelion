package week12.day5;

public class LCS {
    public static void main(String[] args) {
        String str1 = "ABCDEF";
        String str2 = "DCABDC";

        int[][] dp = new int[str2.length()+1][str1.length()+1];

        for (int i = 0; i <str2.length(); i++) {
            for (int j = 0; j < str1.length(); j++) {
                System.out.printf("i:%s j:%s\n", str2.charAt(i), str1.charAt(j));
                if (i == 0 || j == 0)
                    dp[i][j] = 0;
                else if (str2.charAt(i) == str1.charAt(j))
                    dp[i][j] = dp[i-1][j-1]+1;
                else {
                    dp[i][j] = (dp[i-1][j] > dp[i][j-1] ? dp[i-1][j] : dp[i][j-1]);
                }
            }
        }
    }
}

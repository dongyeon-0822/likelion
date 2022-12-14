package week13.day3;

public class OptimalStrategyOfGame {
    static int optimalStrategyOfGame(int arr[], int n)
    {
        int table[][] = new int[n][n];

        for (int gap = 0; gap < n; ++gap) {
            for (int i = 0, j = gap; j < n; ++i, ++j) {
                int x = ((i + 2) <= j) ? table[i + 2][j] : 0;
                int y = ((i + 1) <= (j - 1)) ? table[i + 1][j - 1] : 0;
                int z = (i <= (j - 2)) ? table[i][j - 2] : 0;

                table[i][j] = Math.max(arr[i] + Math.min(x, y),
                        arr[j] + Math.min(y, z));
            }
        }
        return table[0][n - 1];
    }
    public static void main(String[] args)
    {
        int arr1[] = { 8, 15, 3, 7 };
        System.out.println(optimalStrategyOfGame(arr1, arr1.length));

        int arr2[] = { 2, 2, 2, 2 };
        System.out.println(optimalStrategyOfGame(arr2, arr2.length));

        int arr3[] = { 20, 30, 2, 2, 2, 10 };
        System.out.println(optimalStrategyOfGame(arr3, arr3.length));
    }
}

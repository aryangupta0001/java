import java.util.Arrays;

public class TotalPath {
    public static void main(String[] args) {
        int r = 3;
        int c = 3;

        int[][] dp = new int[r + 1][c + 1];

        for (int[] arr : dp)
            Arrays.fill(arr, -1);

        System.out.println(countPaths(r, c, dp));
    }

    static int countPaths(int r, int c, int[][] dp) {
        // if (dp[r][c] > -1)
        //     return dp[r][c];

        if (r == 1 || c == 1)
            return 1;

        // dp[r][c] = countPaths(r - 1, c, dp) + countPaths(r, c - 1, dp) + countPaths(r - 1, c - 1, dp);
        // return dp[r][c];

        return countPaths(r - 1, c, dp) + countPaths(r, c - 1, dp) + countPaths(r - 1, c - 1, dp);

    }
}
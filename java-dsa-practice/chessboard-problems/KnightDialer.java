import java.util.Arrays;

public class KnightDialer {
    public static void main(String[] args) {
        int n = 10;
        int[][][] dp = new int[4][3][n + 1];

        int ans = 0;

        for (int[][] a : dp)
            for (int[] b : a)
                Arrays.fill(b, -1);

        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 3; j++) {
                if (i == 3 & (j == 0 || j == 2))
                    continue;

                ans += getPhoneNumbers(n - 1, dp, i, j) % 1000000007;
            }

        System.out.println(ans);
    }

    static int getPhoneNumbers(int n, int[][][] dp, int row, int col) {
        int ans = 0;

        if (n == 0)
            return 1;

        if (dp[row][col][n] > -1)
            return dp[row][col][n];

        int[][] idcs = { { -2, -1 }, { -2, 1 }, { -1, 2 }, { 1, 2 }, { 2, 1 }, { 2, -1 }, { 1, -2 }, { -1, -2 } };

        for (int[] idx : idcs) {
            int i = row + idx[0];
            int j = col + idx[1];

            if (i < 0 || i > 3 || j < 0 || j > 2)
                continue;

            if (i == 3 & (j == 0 || j == 2))
                continue;

            ans += getPhoneNumbers(n - 1, dp, i, j) % 1000000007;
        }

        dp[row][col][n] = ans;

        if (col == 0)
            dp[row][2][n] = ans;

        if (col == 2)
            dp[row][0][n] = ans;

        return ans;
    }

}

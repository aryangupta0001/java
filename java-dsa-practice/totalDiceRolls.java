import java.util.Arrays;

class totalDiceRolls {
    public static void main(String[] args) {
        int n = 30;
        int k = 30;
        int target = 500;

        System.out.println(numRollsToTarget(n, k, target));
    }

    static int numRollsToTarget(int n, int k, int target) {
        if (n > target)
            return 0;

        int[][] dp = new int[n + 1][target + 1];

        for (int[] arr : dp)
            Arrays.fill(arr, -1);

        return possibleWays(0, target, n, k, dp);
    }

    static int possibleWays(int processed, int unProcessed, int n, int k, int[][] dp) {
        if (dp[n][unProcessed] > -1) {
            return dp[n][unProcessed];
        }

        if (n == 0) {
            if (unProcessed == 0)
                return 1;
            else
                return 0;
        } else if (unProcessed == 0)
            return 0;

        int ans = 0;

        for (int i = 1; i <= k; i++) {
            if (i > unProcessed)
                break;

            int ways = possibleWays(processed + i, unProcessed - i, n - 1, k, dp);

            ans = (ans + ways) % 1000000007;

        }
        dp[n][unProcessed] = ans;

        return ans % 1000000007;
    }
}
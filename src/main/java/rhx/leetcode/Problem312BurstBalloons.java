package rhx.leetcode;

public class Problem312BurstBalloons {

    public int maxCoins(int[] nums) {
        if (nums.length == 0) return 0;
        int N = nums.length;
        int[][] dp = new int[N][N];
        for (int s = 0; s < N; ++s) {
            for (int l = 0; l < N - s; ++l) {
                int r = l + s;
                for (int i = l; i <= r; ++i) {
                    dp[l][r] = Math.max(
                            dp[l][r],
                            (l == 0 ? 1 : nums[l-1]) * nums[i] * (r == (N - 1) ? 1 : nums[r+1]) +
                            (i == l ? 0 : dp[l][i-1]) +
                            (i == r ? 0 : dp[i+1][r])
                    );
                }
            }
        }
        return dp[0][N-1];
    }

}

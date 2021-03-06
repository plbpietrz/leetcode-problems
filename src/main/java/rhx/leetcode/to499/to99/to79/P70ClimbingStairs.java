package rhx.leetcode.to499.to99.to79;

public class P70ClimbingStairs {

    public int climbStairs(int n) {
        if (n == 1) return 1;

        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;

        for (int i = 2; i < dp.length; ++i) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[dp.length - 1];
    }

}

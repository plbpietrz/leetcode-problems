package rhx.leetcode.to499.to199.to199;

public class P198HouseRobbers {
    
    public int rob(int[] nums) {
        int N = nums.length;
        int[] dp = new int[N];
        
        int max = 0;
        for (int i = 0; i < N; ++i) {
            int r1 = i - 3 < 0 ? 0 : dp[i - 3];
            int r2 = i - 2 < 0 ? 0 : dp[i - 2];
            dp[i] = nums[i] + Math.max(r1, r2);
            max = Math.max(max, dp[i]);
        }
        
        return max;
    }
    
}

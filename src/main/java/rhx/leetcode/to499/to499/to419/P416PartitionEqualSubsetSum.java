package rhx.leetcode.to499.to499.to419;

public class P416PartitionEqualSubsetSum {

    Boolean[] memo;

    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }

        if (sum % 2 == 1) return false;

        memo = new Boolean[sum / 2 + 1];

        return helper(nums, 0, sum / 2);
    }

    private boolean helper(int[] nums, int idx, int target) {
        if (target == 0) return true;
        if (memo[target] != null)
            return memo[target];
        for (int i = idx; i < nums.length; i++) {
            int newTarget = target - nums[i];

            if (newTarget < 0) continue;

            memo[newTarget] = helper(nums, i + 1, newTarget);

            if(memo[newTarget])
                return true;
        }
        return false;
    }
}

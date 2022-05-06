package rhx.leetcode.to1499.to1499.to1439;

public class P1438LongestContinuousSubarrayWithAbsoluteDiff {

    public int longestSubarray(int[] nums, int limit) {
        int[][][] dp = new int[nums.length][][];
        int[] result = new int[]{0, 0, 0, 0};

        for (int i = 0; i < nums.length; i++) {
            dp[i] = new int[nums.length][];
        }

        for (int i = 0; i < nums.length; i++) {
            dp[i][i] = new int[]{i, i, nums[i], nums[i]};
            for (int j = i - 1; j >= 0; j--) {
                int[] minmax = dp[j][i - 1];
                if (minmax != null && isOk(nums, minmax, i, limit)) {
                    dp[j][i] = newPair(nums, minmax, i);
                    result = length(result) < length(dp[j][i]) ? dp[j][i] : result;
                } else {
                    break;
                }
            }
        }
        return length(result);
    }

    private boolean isOk(int nums[], int[] pair, int i, int limit) {
        int min = pair[2];
        int max = pair[3];
        int current = nums[i];
        return (min <= current && current <= max)
                || (Math.abs(min - current) <= limit && Math.abs(current - max) <= limit);
    }

    private int[] newPair(int[] nums, int[] pair, int i) {
        int current = nums[i];
        int min = pair[2];
        int max = pair[3];
        if (current <= min)
            return new int[]{pair[0], i, nums[i], max};
        else if (max <= current)
            return new int[]{pair[0], i, min, nums[i]};
        else
            return new int[]{pair[0], i, min, max};
    }

    private int length(int[] pair) {
        return Math.abs(pair[0] - pair[1]) + 1;
    }

}

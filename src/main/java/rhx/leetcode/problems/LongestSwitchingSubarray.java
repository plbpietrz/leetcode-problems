package rhx.leetcode.problems;

public class LongestSwitchingSubarray {

    public int longestSwitchingSubarray(int[] nums) {
        if (nums.length < 3) return nums.length;

        int length = 2, result = 2;
        int first = nums[0], second = nums[1];

        for (int i = 2; i < nums.length; ++i) {
            if (nums[i] == first) {
                length++;
            } else {
                length = 2;
            }
            first = second;
            second = nums[i];
            result = Math.max(result, length);
        }
        return result;
    }
}

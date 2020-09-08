package rhx.leetcode.to499.to99.to9;

import java.util.HashMap;
import java.util.Map;

public class P1TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < nums.length; ++i) {
            int d = target - nums[i]; //difference
            if (seen.containsKey(d)) {
                return new int[]{seen.get(d), i};
            } else {
                seen.put(nums[i], i);
            }
        }
        return null;
    }

}

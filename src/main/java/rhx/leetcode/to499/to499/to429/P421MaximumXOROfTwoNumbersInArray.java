package rhx.leetcode.to499.to499.to429;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class P421MaximumXOROfTwoNumbersInArray {

    public int findMaximumXOR(int... nums) {
        int mask = 0, max = 0, targetMax;
        Set<Integer> maskedInts = new HashSet<>();

        for (int i = 30; i >=0; i--) {
            mask = mask | (1 << i);

            for (int j : nums) {
                int masked = j & mask;
                maskedInts.add(masked);
            }
            targetMax = max | (1 << i);

            for (int j : maskedInts) {
                if (maskedInts.contains(j ^ targetMax)) {
                    max = targetMax;
                    break;
                }
            }
            maskedInts.clear();
        }
        return max;
    }

    public int findMaximumXOR2(int... nums) {
        if (nums.length == 1) return 0;
        int maxBit = 0, maxInside = 0;
        int N = nums.length;

        // set max number
        for (int i = 0; i < N; ++i) {
            maxBit = Math.max(maxBit, maxBit | nums[i]);
            if (maxBit == nums[i])
                maxInside = maxBit;
        }

        if (maxInside == maxBit) return maxInside;

        Set<Integer> set = new HashSet<>();
        for (int i : nums)
            set.add(i);

        for (int i = maxBit; i > 0; --i) {
            for (int j = 0; j < N; ++j) {
                if (set.contains(nums[j] ^ i)) return i;
            }
        }
        return 0;
    }

}

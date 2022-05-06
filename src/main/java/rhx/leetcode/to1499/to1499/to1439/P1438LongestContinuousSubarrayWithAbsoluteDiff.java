package rhx.leetcode.to1499.to1499.to1439;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.function.Function;

public class P1438LongestContinuousSubarrayWithAbsoluteDiff {

    public int longestSubarray(int[] nums, int limit) {
        if (nums.length == 0) return 0;
        PriorityQueue<Integer> minQueue = new PriorityQueue<>(Integer::compareTo);
        PriorityQueue<Integer> maxQueue = new PriorityQueue<>(Comparator.comparingInt(Integer::intValue).reversed());
        int result = 0;
        minQueue.add(nums[0]);
        maxQueue.add(nums[0]);
        for (int i = 0, j = 1; j < nums.length; ++j) {
            int curr = nums[j];
            int min = minQueue.peek();
            int max = maxQueue.peek();

            if (min <= curr && curr <= max) {
                result = Math.max(result, j - i);
            } else {
                 if (isOutsideLimit(limit, curr, min, max)) {
                    do {
                        int start = nums[i++];
                        minQueue.remove(start);
                        maxQueue.remove(start);
                        if (minQueue.size() == 0) {
                            break;
                        } else {
                            min = minQueue.peek();
                            max = maxQueue.peek();
                        }
                    } while (isOutsideLimit(limit, curr, min, max));
                 }
            }
            minQueue.add(curr);
            maxQueue.add(curr);
            result = Math.max(result, j - i);
        }
        return result + 1;
    }

    private boolean isOutsideLimit(int limit, int curr, int min, int max) {
        return Math.abs(curr - min) > limit || Math.abs(max - curr) > limit;
    }

}

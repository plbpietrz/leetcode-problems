package rhx.leetcode;

import java.util.PriorityQueue;

public class Problem215KthLargesElementInArray {

    public int findKthLargest(int[] nums, int k) {
        if (nums.length == 1 && k == 1) return nums[0];

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int n : nums) {
            if (queue.size() >= k + 1) {
                queue.poll();
            }
            queue.offer(n);
        }

        if (k < nums.length)
            queue.poll();
        return queue.poll();
    }

}

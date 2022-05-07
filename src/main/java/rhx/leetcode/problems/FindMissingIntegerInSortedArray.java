package rhx.leetcode.problems;

public class FindMissingIntegerInSortedArray {

    public int find(int[] nums) {
        int left = 0;
        int right = nums.length;
        int mid = (right - left) / 2;
        int base = nums[0];

        while(left < right) {
            if (nums[mid] - base == mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
            mid = left + (right - left) / 2;
        }

        if (left == nums.length)
            return -1;
        else
            return ((nums[mid] - base) == mid)
                    ? nums[mid] + 1
                    : nums[mid] - 1;
    }

}

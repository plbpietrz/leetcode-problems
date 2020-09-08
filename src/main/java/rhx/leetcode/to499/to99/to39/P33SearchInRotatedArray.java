package rhx.leetcode.to499.to99.to39;

public class P33SearchInRotatedArray {

    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            //System.out.println("" + low + " " + mid + " " + high + " | " + nums[low] + " " + nums[mid] + " " + nums[high]);
            if (nums[mid] == target) {
                return mid;
            } else if (target < nums[mid]) {
                if (nums[low] == target) return low;
                if (nums[low] <= nums[mid]) {
                    if (nums[low] < target) {
                        high = mid - 1;
                    } else {
                        low = mid + 1;
                    }
                } else {
                    high = mid - 1;
                }
            } else {
                if (nums[high] == target) return high;
                if (nums[mid] <= nums[high]) {
                    if (target < nums[high]) {
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                } else {
                    low = mid + 1;
                }
            }
        }

        return -1;
    }

}

package rhx.leetcode.to499.to199.to159;

public class P152MaximumProductSubarray {

    public int maxProduct(int... nums) {
        int min[] = new int[nums.length];       // minimum product ending with ith index
        int max[] = new int[nums.length];       // maximum product ending with ith index

        min[0] = nums[0];
        max[0] = nums[0];

        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            if (num > 0) {
                max[i] = Math.max(max[i - 1] * num, num);
                min[i] = Math.min(min[i - 1] * num, num);
            } else {
                max[i] = Math.max(min[i - 1] * num, num);
                min[i] = Math.min(max[i - 1] * num, num);
            }
            ans = Math.max(ans, max[i]);
        }
        return ans;
    }

}

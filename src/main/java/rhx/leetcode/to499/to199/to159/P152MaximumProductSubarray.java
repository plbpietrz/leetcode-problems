package rhx.leetcode.to499.to199.to159;

public class P152MaximumProductSubarray {

    public int maxProduct(int... nums) {
        int mini[] = new int[nums.length];       // minimum product ending with ith index
        int maxi[] = new int[nums.length];       // maximum product ending with ith index

        mini[0] = nums[0];
        maxi[0] = nums[0];

        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > 0) {
                maxi[i] = Math.max(maxi[i - 1] * nums[i], nums[i]);
                mini[i] = Math.min(mini[i - 1] * nums[i], nums[i]);
            } else {
                maxi[i] = Math.max(mini[i - 1] * nums[i], nums[i]);
                mini[i] = Math.min(maxi[i - 1] * nums[i], nums[i]);
            }
            ans = Math.max(ans, maxi[i]);
        }
        return ans;
    }

}

package rhx.leetcode.to999.to599.to569;

import java.util.HashMap;
import java.util.Map;

public class P560SubarraySumEqualsK {

    public int subarraySum(int[] nums, int k) {
        int sum = 0;
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < nums.length; ++i) {
            sum += nums[i];

            if (map.containsKey(sum) == false) map.put(sum, 0);

            if (map.containsKey(sum - k))
                ans += map.get(sum - k);
            map.put(sum, map.get(sum) + 1);
        }
        return ans;
    }

}

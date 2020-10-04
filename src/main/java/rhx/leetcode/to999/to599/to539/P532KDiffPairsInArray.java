package rhx.leetcode.to999.to599.to539;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

public class P532KDiffPairsInArray {

    public int findPairs(int[] nums, int k) {
        int result = 0;
        Set<Integer> set = new ConcurrentSkipListSet<>();
        if (k == 0) {
            Set<Integer> sum = new ConcurrentSkipListSet<>();
            for (int n : nums) {
                if (!sum.contains(n + n) && set.contains(n)) {
                    result += 1;
                    sum.add(n + n);
                } else {
                    set.add(n);
                }
            }
        } else {
            for (int n : nums) {
                set.add(n);
            }

            Iterator<Integer> iterator = set.iterator();
            while (iterator.hasNext()) {
                int n = iterator.next();
                iterator.remove();

                while (set.contains(k + n)) {
                    result += 1;
                    n = k + n;
                    set.remove(n);
                }
            }
        }

        return result;
    }

}

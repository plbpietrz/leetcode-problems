package rhx.leetcode.to1499.to1299.to1289;

import java.util.Arrays;
import java.util.Comparator;

public class P1288RemoveCoveredIntervals {

    private static final int S = 0;
    private static final int E = 1;

    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);
        int result = 1;
        int e = intervals[0][E];
        for (int i = 1; i < intervals.length; ++i) {
            int[] ival = intervals[i];
            if (e <= ival[S] || e < ival[E]) {
                e = ival[E];
                result += 1;
            }
        }
        return result;
    }

}

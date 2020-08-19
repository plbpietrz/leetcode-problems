package rhx.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Problem56MergeIntervals {

    private static int START = 0;
    private static int END = 1;

    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) {
            return intervals;
        }

        List<int[]> output = new ArrayList<>();
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));

        int start = intervals[0][0];
        int end   = intervals[0][1];
        for (int i = 1; i < intervals.length; ++i) {
            int[] interval = intervals[i];

            if (interval[START] <= end) {
                if (interval[END] > end) {
                    end = interval[END];
                }
            } else {
                output.add(new int[]{start, end});
                start = interval[START];
                end   = interval[END];
            }
        }
        output.add(new int[]{start, end});
        return output.toArray(new int[0][]);
    }

}

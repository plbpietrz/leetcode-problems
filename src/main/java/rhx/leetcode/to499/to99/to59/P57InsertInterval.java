package rhx.leetcode.to499.to99.to59;

import java.util.ArrayList;
import java.util.List;

public class P57InsertInterval {

    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>(intervals.length + 2);
        final int S = 0, E = 1;
        int newStart = newInterval[S], newEnd = newInterval[E];
        boolean open = false;
        boolean notFound = true;
        for (int i = 0; i < intervals.length; ++i) {
            int[] currInterval = intervals[i];

            if (notFound) {
                // add current if it is not connected to the new
                if (!open && currInterval[E] < newInterval[S]) {
                    result.add(currInterval);
                }

                // new is before current
                if (newInterval[E] < currInterval[S]) {
                    result.add(new int[]{newStart, newEnd});
                    result.add(currInterval);
                    notFound = false;
                    continue;
                }

                // intervals overlap one way or another
                if (!open && ((newInterval[S] <= currInterval[S] && currInterval[S] <= newInterval[E]) || (currInterval[S] <= newInterval[S] && newInterval[S] <= currInterval[E]))) {
                    newStart = Math.min(newInterval[S], currInterval[S]);
                    newEnd = Math.max(newInterval[E], currInterval[E]);
                    open = true;
                } else {
                    // current is inside new
                    newEnd = Math.max(newInterval[E], currInterval[E]);
                }

            } else {
                result.add(currInterval);
            }
        }
        // add the new interval as last because it was not found
        if (notFound)
            result.add(new int[]{newStart, newEnd});

        return result.toArray(new int [0][]);
    }

}

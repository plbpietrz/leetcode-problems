package rhx.leetcode.to1499.to1099.to1099;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class P1094CarPooling {

    private static final int LOAD = 0;
    private static final int START = 1;
    private static final int END = 2;

    public boolean carPooling(int[][] trips, int capacity) {
        int load = 0;

        Arrays.sort(trips, Comparator.comparing(a -> a[1]));

        Queue<int[]> queue = new PriorityQueue<>(Comparator.comparing(a -> a[1]));
        for (int[] trip : trips) {
            while (queue.size() > 0 && queue.peek()[1] <= trip[START]) {
                int[] poll = queue.poll();
                load -= poll[0];
            }

            load += trip[LOAD];

            if (load > capacity) return false;

            queue.offer(new int[]{trip[LOAD], trip[END]});
        }

        return true;
    }

    // Faster according to leetcode, but I doubt, probably because of N
    public boolean carPooling2(int[][] trips, int capacity) {
        int length = 0;
        for (int[] trip : trips) {
            length = Math.max(length, trip[2]);
        }

        int[] road = new int[length];
        for (int[] trip : trips) {
            for (int i = trip[1]; i < trip[2]; ++i) {
                road[i] += trip[0];
                if (road[i] > capacity) return false;
            }
        }

        return true;
    }
}

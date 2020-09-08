package rhx.leetcode.to1499.to1099.to1049;

import java.util.Comparator;
import java.util.PriorityQueue;

public class P1046LastStoneWeight {

    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());

        for (int s : stones) {
            queue.offer(s);
        }

        while(queue.size() > 1) {
            int s1 = queue.poll();
            int s2 = queue.poll();
            if (s1 != s2)
                queue.offer(Math.abs(s1 - s2));
        }

        return queue.size() == 0 ? 0 : queue.poll();
    }

}

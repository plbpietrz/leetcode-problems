package rhx.leetcode.to499.to499.to459;

public class P457CircularArrayLoop {

    public boolean circularArrayLoop(int[] nums) {

        boolean[] globVisit = new boolean[nums.length];

        for (int i = 0; i < nums.length; ++i) {
            if (globVisit[i]) continue;
            boolean[] currVisit = new boolean[nums.length];

            int index = i, steps, next;

            do {
                currVisit[index] = true;
                globVisit[index] = true;
                steps = nums[index];
                next = ((index + steps) % nums.length + nums.length) % nums.length;

                if (index == next) break;

                if (Integer.signum(steps) == Integer.signum(nums[next])) {
                    index = next;
                } else {
                    break;
                }

                if (currVisit[index]) {
                    return true;
                } else if (globVisit[index]) {
                    break;
                }
            } while (true);
        }
        return false;
    }

}

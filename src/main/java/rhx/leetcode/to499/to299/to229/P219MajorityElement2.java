package rhx.leetcode.to499.to299.to229;

import java.util.ArrayList;
import java.util.List;

public class P219MajorityElement2 {

    public List<Integer> majorityElement(int... nums) {
        boolean fs = false, ss = false;
        int fn = Integer.MIN_VALUE, fc = 0;
        int sn = Integer.MIN_VALUE, sc = 0;

        for (int i : nums) {
            if (fs && i == fn) {
                fc += 1;
            } else if (ss && i == sn) {
                sc += 1;
            } else if (fc == 0) {
                fn = i;
                fc = 1;
                fs = true;
            } else if (sc == 0) {
                sn = i;
                sc = 1;
                ss = true;
            } else {
                fc -= 1;
                sc -= 1;
            }
        }

        fc = 0;
        sc = 0;

        for (int i : nums) {
            if (fs && i == fn) fc++;
            if (ss && i == sn) sc++;
        }

        int N = nums.length / 3;
        List<Integer> result = new ArrayList<>();
        if (fc > N) result.add(fn);
        if (sc > N) result.add(sn);

        return result;
    }

}

package rhx.leetcode.problems0to9;

import java.util.Arrays;

import static java.lang.Math.max;

public class P3LongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        int[] lastIndexOfChar = new int[256];    //lets hope input is only ascii
        Arrays.fill(lastIndexOfChar, -1);

        int x = 0;
        for (int i = 0; i < s.length(); ++i) {
            x = max(x, lastIndexOfChar[s.charAt(i)] );
            result = max(result, i - x);
            lastIndexOfChar[s.charAt(i)] = i;
        }

        return result;
    }

}

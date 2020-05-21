package rhx.leetcode;

import java.util.HashSet;
import java.util.Set;

import static java.lang.Math.max;

public class Problem3LongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        int result = 0, seqStart = 0, seqEnd = 0;
        char[] inputChars = s.toCharArray();
        Set<Character> unique = new HashSet<>();

        while (seqEnd < inputChars.length) {
            if (!unique.add(inputChars[seqEnd])) {
                result = max(result, seqEnd - seqStart);
                while (inputChars[seqStart] != inputChars[seqEnd] && seqStart <= seqEnd) {
                    unique.remove(inputChars[seqStart++]);
                }
                seqStart += 1;
            }
            seqEnd += 1;
        }
        

        return max(result, seqEnd - seqStart);
    }

}

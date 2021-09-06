package rhx.leetcode.to1499.to1399.to1349;

public class P1347MinimumNumberOfStepsToMakeTwoStringsAnagram {

    private static final int OFFSET = 97;
    private static final int HISTOGRAM_SIZE = 32;

    public int minSteps(String s, String t) {
        int[] hists = new int[HISTOGRAM_SIZE];


        for (char c : s.toCharArray()) {
            hists[c - OFFSET] += 1;
        }

        for (char c : t.toCharArray()) {
            if (hists[c - OFFSET] > 0)
                hists[c - OFFSET] -= 1;
        }

        int result = 0;
        for (int i = 0; i < HISTOGRAM_SIZE; i++) {
            result += hists[i];
        }
        return result;
    }

}

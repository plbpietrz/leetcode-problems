package rhx.leetcode.to499.to399.to399;

public class P398FindTheDifference {

    public char findTheDifference(String s, String t) {
        int[] found = new int[32];
        for (char c : s.toCharArray()) {
            found[c - 97] += 1;
        }

        for (char c : t.toCharArray()) {
            found[c - 97] -= 1;
            if (found[c - 97] < 0) return c;
        }

        return 0;
    }

}

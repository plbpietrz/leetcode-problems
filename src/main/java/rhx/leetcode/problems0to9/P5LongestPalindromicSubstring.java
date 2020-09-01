package rhx.leetcode.problems0to9;

public class P5LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        char[] string = s.toCharArray();
        String result = "";
        for (int i = 0; i < string.length; ++i) {
            for (int x = 1; i - x + 1 > -1 && i + x < string.length; ++x) {
                int l = i - x + 1;
                int r = i + x;
                if (string[l] == string[r]) {
                    if (result.length() < r - l + 1)
                        result = s.substring(l, r + 1);
                } else {
                    break;
                }
            }

            for (int x = 0; i - x > -1 && i + x < string.length; ++x) {
                int l = i - x;
                int r = i + x;
                if (string[l] == string[r]) {
                    if (result.length() < r - l + 1)
                        result = s.substring(l, r + 1);
                } else {
                    break;
                }
            }
        }
        return result;
    }

}

package rhx.leetcode.problems1160to1169;

public class P1160FindWordsFormedByChars {

    public int countCharacters(String[] words, String chars) {
        int[] imap = new int[100];
        for (char c : chars.toCharArray())
            imap[c - 65] += 1;

        int sum = 0;

        label:for (String word : words) {
            int[] wmap = new int[100];
            for (char c : word.toCharArray()) {
                wmap[c - 65] += 1;
            }

            for (int i = 0; i < wmap.length; ++i) {
                if (wmap[i] > imap[i]) continue label;
            }

            sum += word.length();
        }

        return sum;
    }

}

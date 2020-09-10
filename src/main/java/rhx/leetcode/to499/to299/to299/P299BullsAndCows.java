package rhx.leetcode.to499.to299.to299;

public class P299BullsAndCows {

    public String getHint(String secret, String guess) {
        int[] sFreq = new int[10];
        int[] gFreq = new int[10];

        char[] sArr = secret.toCharArray();
        char[] gArr = guess.toCharArray();

        int exact = 0;
        for (int i = 0; i < sArr.length; ++i) {
            if (sArr[i] == gArr[i]) {
                exact += 1;
            } else {
                sFreq[sArr[i] - 48] += 1;
                gFreq[gArr[i] - 48] += 1;
            }
        }

        int guessed = 0;
        for (int i = 0; i < 10; ++i) {
            guessed += sFreq[i] > 0 ? Math.min(sFreq[i], gFreq[i]) : 0;
        }

        return String.format("%dA%dB", exact, guessed);
    }

}

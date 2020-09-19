package rhx.leetcode.to1499.to1299.to1299;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P1291SequentialDigits {

    public List<Integer> sequentialDigits(int low, int high) {
        int numOfdigits = (int)(Math.log10(low) + 1);
        int startDigit = (int)(low / Math.pow(10, numOfdigits - 1));

        int num = genNum(startDigit, numOfdigits);
        int inc = genInc(startDigit, numOfdigits);
        numOfdigits = (int)(Math.log10(num) + 1);

        if (num < low) {
            if (numOfdigits == 9) return Collections.emptyList();
            num += inc;
            if (num % 10 == 0) {
                num = genNum(1, ++numOfdigits);
                inc = genInc(1, numOfdigits);
                numOfdigits = (int)(Math.log10(num) + 1);
            }
        }

        List<Integer> result = new ArrayList<>();
        while (low <= num && num <= high) {
            result.add(num);

            num += inc;
            if (num % 10 == 0) {
                num = genNum(1, ++numOfdigits);
                inc = genInc(1, numOfdigits);
                numOfdigits = (int)(Math.log10(num) + 1);
            }
        }
        return result;
    }

    private int genNum(int sDig, int nDig) {
        if (sDig + nDig - 1 > 9){
            nDig += 1;
            sDig = 1;
        }
        int result = sDig;
        while (nDig > 1) {
            result = (result * 10) + (++sDig);
            nDig -= 1;
        }
        return result;
    }

    private int genInc(int sDig, int nDig) {
        if (sDig + nDig - 1 > 9){
            nDig += 1;
        }
        int start = 1;
        while (nDig-- > 1)
            start = start * 10 + 1;
        return start;
    }

}

package rhx.leetcode.to499.to499.to419;


public class P415AddStrings {

    public String addStrings(String num1, String num2) {
        int i = atoi(num1);
        int j = atoi(num2);

        return String.valueOf(i + j);
    }

    private int atoi(String num1) {
        int result = 0;
        char[] chars = num1.toCharArray();
        int pow10 = 1;
        int i = chars.length;
        do {
            i--;
            char x = chars[i];
            if (!isDigit(x)) throw new IllegalArgumentException("NAN: " + num1);
            result += (x - 48) * pow10;
            pow10 *= 10;
        } while (i > 0);
        return result;
    }

    boolean isDigit(char x) {
        return 47 < x && x < 58;
    }

}

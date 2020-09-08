package rhx.leetcode.to499.to99.to19;

public class P12IntegerToRoman {

    private String[][] lookup = {
            {"I", "V", "X"},
            {"X", "L", "C"},
            {"C", "D", "M"},
            {"M"}
    };

    public String intToRoman(int num) {
        String numeral = "";
        int i = 0;
        while (num > 0) {
            numeral = format(num % 10, i++) + numeral;
            num /= 10;
        }
        return numeral;
    }

    private String format(int n, int dep) {
        if (n < 4) {
            return lookup[dep][0].repeat(n);
        } else if (n == 4) {
            return lookup[dep][0] + lookup[dep][1];
        } else if (n == 5) {
            return lookup[dep][1];
        } else if (n < 9) {
            return lookup[dep][1] + lookup[dep][0].repeat(n - 5);
        } else {
            return lookup[dep][0] + lookup[dep][2];
        }
    }

}

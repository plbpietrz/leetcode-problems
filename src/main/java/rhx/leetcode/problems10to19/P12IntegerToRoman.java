package rhx.leetcode.problems10to19;

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

    private String format(int n, int div) {
        if (n < 4) {
            return lookup[div][0].repeat(n);
        } else if (n == 4) {
            return lookup[div][0] + lookup[div][1];
        } else if (n == 5) {
            return lookup[div][1];
        } else if (n < 9) {
            return lookup[div][1] + lookup[div][0].repeat(n - 5);
        } else {
            return lookup[div][0] + lookup[div][2];
        }
    }

}

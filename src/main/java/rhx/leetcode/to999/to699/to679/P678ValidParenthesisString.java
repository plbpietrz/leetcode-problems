package rhx.leetcode.to999.to699.to679;

public class P678ValidParenthesisString {

    public boolean checkValidString(String s) {
        char[] str = s.toCharArray();
        int N = str.length;
        int balance = 0;
        for (int i = 0; i < N; ++i) {
            switch (str[i]) {
                case '(':
                case '*':
                    balance += 1;
                    break;
                case ')':
                    balance -= 1;
                    if (balance < 0)
                        return false;
                    break;
            }
        }
        balance = 0;
        for (int i = N - 1; i >= 0; --i) {
            switch (str[i]) {
                case ')':
                case '*':
                    balance += 1;
                    break;
                case '(':
                    balance -= 1;
                    if (balance < 0)
                        return false;
                    break;
            }
        }

        return true;
    }

}

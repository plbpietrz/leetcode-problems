package rhx.leetcode.to499.to199.to129;

public class P121BuyAndSellStock {

    public int maxProfit(int... prices) {
        if (prices.length == 0) return 0;

        int min = prices[0], max = 0;
        for (int p : prices) {
            if (p < min) {
                min = p;
            } else {
                max = Math.max(max, p - min);
            }
        }

        return max;
    }

}

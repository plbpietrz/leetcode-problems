package rhx.leetcode.to499.to199.to129;

public class P122BuyAndSellStockII {

    public int maxProfit(int... prices) {
        if (prices.length == 0) return 0;
        int min = prices[0], max = prices[0], profit = 0;
        for (int i = 1; i< prices.length; ++i) {
            if (max > prices[i]) {
                profit += (max - min);
                min = prices[i];
            }
            max = prices[i];
        }
        if (max > min)
            profit += (max - min);
        return profit;
    }

}

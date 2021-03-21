package rhx.leetcode.to499.to199.to129;

public class P123BuyAndSellStockIII {

    public int maxProfit(int... prices) {
        if (prices.length == 0 || prices.length == 1) return 0;

        int min = prices[0], max = prices[0], best = 0, secondBest = 0;
        for (int i = 1; i < prices.length; ++i) {
            if (max > prices[i]) {
                int profit = max - min;
                if (profit > best) {
                    secondBest = best;
                    best = profit;
                } else if (profit > secondBest) {
                    secondBest = profit;
                }
                min = prices[i];
            }
            max = prices[i];
        }

        if (max > min) {
            int profit = max - min;
            if (profit > best) {
                secondBest = best;
                best = profit;
            } else if (profit > secondBest) {
                secondBest = profit;
            }
        }

        return best + secondBest;
    }

}

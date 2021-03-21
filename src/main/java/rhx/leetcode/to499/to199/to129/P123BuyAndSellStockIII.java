package rhx.leetcode.to499.to199.to129;

public class P123BuyAndSellStockIII {

    public int maxProfit(int... prices) {
        if (prices.length == 0 || prices.length == 1) return 0;

        int firstTradeMin = Integer.MAX_VALUE, firstTradeProfit = 0, secondTradeMin = Integer.MAX_VALUE, secondTradeProfit = 0;
        for (int p : prices) {
            // calculate the first trade minimum price
            firstTradeMin = Math.min(firstTradeMin, p);
            // calculated the first trade profit based on lowest price seen so far
            firstTradeProfit = Math.max(firstTradeProfit, p - firstTradeMin);
            // find the second trade minimum as the lowest price seen so far decreased by the profit from the first trade
            secondTradeMin = Math.min(secondTradeMin, p - firstTradeProfit);
            // find the second trade profit as the diff between current price and the lowest price seen so far
            secondTradeProfit = Math.max(secondTradeProfit, p - secondTradeMin);
        }

        return secondTradeProfit;
    }

}

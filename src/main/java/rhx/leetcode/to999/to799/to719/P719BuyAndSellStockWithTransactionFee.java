package rhx.leetcode.to999.to799.to719;

public class P719BuyAndSellStockWithTransactionFee {

    public int maxProfit(int[] prices, int fee) {
        int maxStock = Integer.MIN_VALUE;
        int maxEmpty = 0;

        for (int p : prices) {
            maxStock = Math.max(maxStock, maxEmpty - p);
            maxEmpty = Math.max(maxEmpty, maxStock + p - fee);
        }

        return maxEmpty;
    }

}

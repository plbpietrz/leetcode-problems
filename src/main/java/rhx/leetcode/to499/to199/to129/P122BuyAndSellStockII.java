package rhx.leetcode.to499.to199.to129;

public class P122BuyAndSellStockII {

    public int maxProfit(int... prices) {
        if (prices.length == 0) return 0;
        int withStock = Integer.MIN_VALUE, withoutStock = 0;
        for (int price : prices) {
            withStock = Math.max(withStock, withoutStock - price);
            withoutStock = Math.max(withoutStock, withStock + price);
        }
        return withoutStock;
    }

}

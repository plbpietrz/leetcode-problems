package rhx.leetcode.to999.to799.to719;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P719BuyAndSellStockWithTransactionFeeTest {

    P719BuyAndSellStockWithTransactionFee sut;

    @BeforeEach
    void setup() {
        sut = new P719BuyAndSellStockWithTransactionFee();
    }

    @Test
    void test_1() {
        assertEquals(8, sut.maxProfit(new int[]{1, 3, 2, 8, 4, 9}, 2));
    }

    @Test
    void test_2() {
        assertEquals(6, sut.maxProfit(new int[]{1, 3, 7, 5, 10, 3}, 3));
    }

}
package rhx.leetcode.to499.to199.to129;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P122BuyAndSellStockIITest {

    private P122BuyAndSellStockII sut;

    @BeforeEach
    void setUp() {
        sut = new P122BuyAndSellStockII();
    }

    @Test
    void test_1() {
        assertEquals(4, sut.maxProfit(1, 2, 3, 4, 5));
    }

    @Test
    void test_2() {
        assertEquals(7, sut.maxProfit(7, 1, 5, 3, 6, 4));
    }

    @Test
    void test_3() {
        assertEquals(0, sut.maxProfit(5, 4, 3, 2, 1));
    }
}
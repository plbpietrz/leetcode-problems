package rhx.leetcode.to499.to199.to129;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P123BuyAndSellStockIIITest {

    private P123BuyAndSellStockIII sut;

    @BeforeEach
    void setUp() {
        sut = new P123BuyAndSellStockIII();
    }

    @Test
    void test_1() {
        assertEquals(6, sut.maxProfit(3, 3, 5, 0, 0, 3, 1, 4));
    }

    @Test
    void test_2() {
        assertEquals(4, sut.maxProfit(1, 2, 3, 4, 5));
    }

    @Test
    void test_3() {
        assertEquals(0, sut.maxProfit(4, 3, 2, 1));
    }

    @Test
    void test_4() {
        assertEquals(0, sut.maxProfit(1));
    }

    @Test
    void test_5() {
        assertEquals(13, sut.maxProfit(1, 2, 4, 2, 5, 7, 2, 4, 9, 0));
    }

}
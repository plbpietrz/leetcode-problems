package rhx.leetcode.to499.to199.to129;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P121BuyAndSellStockTest {

    private P121BuyAndSellStock sut;

    @BeforeEach
    void setUp() {
        sut = new P121BuyAndSellStock();
    }

    @Test
    void test_1() {
        assertEquals(5, sut.maxProfit(7, 1, 5, 3, 6, 4));
    }

    @Test
    void test_2() {
        assertEquals(0, sut.maxProfit(7, 6, 4, 3, 1));
    }

    @Test
    void test_3() {
        assertEquals(0, sut.maxProfit());
    }

}
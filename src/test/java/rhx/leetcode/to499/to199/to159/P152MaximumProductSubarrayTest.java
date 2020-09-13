package rhx.leetcode.to499.to199.to159;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P152MaximumProductSubarrayTest {


    private P152MaximumProductSubarray sut;

    @BeforeEach
    void setUp() {
        sut = new P152MaximumProductSubarray();
    }

    @Test
    void test_1() {
        assertEquals(6, sut.maxProduct(2, 3, -2, 4));
    }

    @Test
    void test_2() {
        assertEquals(0, sut.maxProduct(-2, 0, -1));
    }

    @Test
    void test_3() {
        assertEquals(-2, sut.maxProduct(-2));
    }

}
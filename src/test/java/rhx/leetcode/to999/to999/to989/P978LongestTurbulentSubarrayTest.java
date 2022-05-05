package rhx.leetcode.to999.to999.to989;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P978LongestTurbulentSubarrayTest {

    private P978LongestTurbulentSubarray sut;

    @BeforeEach
    void setup() {
        sut = new P978LongestTurbulentSubarray();
    }

    @Test
    void test_1() {
        assertEquals(5, sut.maxTurbulenceSize(new int[]{9, 4, 2, 10, 7, 8, 8, 1, 9}));
    }

    @Test
    void test_2() {
        assertEquals(2, sut.maxTurbulenceSize(new int[]{4, 8, 12, 16}));
    }

    @Test
    void test_3() {
        assertEquals(1, sut.maxTurbulenceSize(new int[]{100}));
    }

    @Test
    void test_4() {
        assertEquals(2, sut.maxTurbulenceSize(new int[]{4, 4, 4, 4, 8, 12, 16, 16, 16, 5}));
    }

    @Test
    void test_5() {
        assertEquals(5, sut.maxTurbulenceSize(new int[]{0, 1, 1, 0, 1, 0, 1, 1, 0, 0}));
    }

    @Test
    void test_6() {
        assertEquals(8, sut.maxTurbulenceSize(new int[]{0,8,45, 88, 48, 68, 28, 55, 17, 24}));
    }
}
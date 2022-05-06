package rhx.leetcode.problems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSwitchingSubarrayTest {

    LongestSwitchingSubarray sut;

    @BeforeEach
    void setup() {
        sut = new LongestSwitchingSubarray();
    }

    @Test
    void test_1() {
        assertEquals(4, sut.longestSwitchingSubarray(new int[]{2, 4, 2, 4}));
    }

    @Test
    void test_2() {
        assertEquals(4, sut.longestSwitchingSubarray(new int[]{3, 7, 3, 7, 2, 1, 2}));
    }

    @Test
    void test_3() {
        assertEquals(3, sut.longestSwitchingSubarray(new int[]{1, 5, 6, 0, 1, 0}));
    }

    @Test
    void test_4() {
        assertEquals(3, sut.longestSwitchingSubarray(new int[]{7, -5, -5, -5, 7, -1, 7}));
    }

    @Test
    void test_5() {
        assertEquals(8, sut.longestSwitchingSubarray(new int[]{1, 2, 3, 4, 3, 4, 3, 4, 5, 6, 7, 8, 9, 8, 9, 8, 9, 8, 9, 6, 1}));
    }

    @Test
    void test_6() {
        assertEquals(1, sut.longestSwitchingSubarray(new int[]{1}));
    }

}
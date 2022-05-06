package rhx.leetcode.to1499.to1499.to1439;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P1438LongestContinuousSubarrayWithAbsoluteDiffTest {

    P1438LongestContinuousSubarrayWithAbsoluteDiff sut;

    @BeforeEach
    void setup() {
        sut = new P1438LongestContinuousSubarrayWithAbsoluteDiff();
    }

    @Test
    void test_1() {
        assertEquals(2, sut.longestSubarray(new int[]{8, 2, 4, 7}, 4));
    }

    @Test
    void test_2() {
        assertEquals(4, sut.longestSubarray(new int[]{10, 1, 2, 4, 7, 2}, 5));
    }

    @Test
    void test_3() {
        assertEquals(3, sut.longestSubarray(new int[]{4, 2, 2, 2, 4, 4, 2, 2}, 0));
    }

    @Test
    void test_4() {
        assertEquals(4, sut.longestSubarray(new int[]{10, 1, 2, 4, 7, 2}, 5));
    }

    @Test
    void test_5() {
        assertEquals(8, sut.longestSubarray(new int[]{8, 7, 4, 2, 8, 1, 7, 7}, 8));
    }

    @Test
    void test_6() {
        assertEquals(1, sut.longestSubarray(new int[]{8}, 10));
    }

}
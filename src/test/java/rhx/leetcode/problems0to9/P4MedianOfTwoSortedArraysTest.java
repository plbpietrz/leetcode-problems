package rhx.leetcode.problems0to9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P4MedianOfTwoSortedArraysTest {

    private P4MedianOfTwoSortedArrays sut;

    @BeforeEach
    public void setup() {
        sut = new P4MedianOfTwoSortedArrays();
    }

    @Test
    public void test_1() {
        assertEquals(2.5d, sut.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));
    }

    @Test
    public void test_2() {
        assertEquals(0.d, sut.findMedianSortedArrays(new int[]{0, 0}, new int[]{0, 0}));
    }

    @Test
    public void test_3() {
        assertEquals(2.d, sut.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));
    }

    @Test
    public void test_4() {
        assertEquals(2.d, sut.findMedianSortedArrays(new int[]{4}, new int[]{1, 2, 3, 5, 6}));
    }
}
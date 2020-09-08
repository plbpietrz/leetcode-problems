package rhx.leetcode.to499.to99.to9;

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
        assertEquals(3.5d, sut.findMedianSortedArrays(new int[]{4}, new int[]{1, 2, 3, 5, 6}));
    }

    @Test
    public void test_5() {
        assertEquals(1.d, sut.findMedianSortedArrays(new int[]{}, new int[]{1}));
    }

    @Test
    public void test_6() {
        assertEquals(6.d, sut.findMedianSortedArrays(new int[]{4, 5, 6, 7, 9}, new int[]{}));
    }

    @Test
    public void test_7() {
        assertEquals(2.5d, sut.findMedianSortedArrays(new int[]{}, new int[]{1, 2, 3, 4}));
    }

    @Test
    public void test_8() {
        assertEquals(3.5d, sut.findMedianSortedArrays(new int[]{1, 2, 3, 5, 6}, new int[]{4}));
    }

    @Test
    public void test_9() {
        assertEquals(3.5d, sut.findMedianSortedArrays(new int[]{1, 2, 3, 4, 6}, new int[]{5}));
    }

    @Test
    public void test_10() {
        assertEquals(3.5d, sut.findMedianSortedArrays(new int[]{1, 2, 3, 4, 5, 6, 9, 10}, new int[]{7, 8}));
    }
}
package rhx.leetcode.to1499.to1099.to1099;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P1094CarPoolingTest {

    private P1094CarPooling sut;

    @BeforeEach
    void setUp() {
        sut = new P1094CarPooling();
    }

    @Test
    void test_1() {
        assertFalse(sut.carPooling(new int[][]{{2, 1, 5}, {3, 3, 7}}, 4));
    }

    @Test
    void test_2() {
        assertTrue(sut.carPooling(new int[][]{{2, 1, 5}, {3, 3, 7}}, 5));
    }

    @Test
    void test_3() {
        assertTrue(sut.carPooling(new int[][]{{2, 1, 5}, {3, 5, 7}}, 3));
    }

    @Test
    void test_4() {
        assertTrue(sut.carPooling(new int[][]{{3, 2, 7}, {3, 7, 9}, {8, 3, 9}}, 11));
    }

    @Test
    void test_5() {
        assertFalse(sut.carPooling(new int[][]{{7, 5, 6}, {6, 7, 8}, {10, 1, 6}}, 16));
    }
}
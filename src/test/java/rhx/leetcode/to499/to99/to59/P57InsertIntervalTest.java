package rhx.leetcode.to499.to99.to59;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P57InsertIntervalTest {

    private P57InsertInterval sut;

    @BeforeEach
    void setUp() {
        sut = new P57InsertInterval();
    }

    @Test
    void test_1() {
        assertArrayEquals(new int[][]{{1, 5}, {6, 9}}, sut.insert(new int[][]{{1, 3}, {6, 9}}, new int[]{2, 5}));
    }

    @Test
    void test_2() {
        assertArrayEquals(new int[][]{{1, 2}, {3, 10}, {12, 16}}, sut.insert(new int[][]{{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}}, new int[]{4, 8}));
    }

    @Test
    void test_3() {
        assertArrayEquals(new int[][]{{1, 9}}, sut.insert(new int[][]{{1, 3}, {6, 9}}, new int[]{3, 6}));
    }

    @Test
    void test_4() {
        assertArrayEquals(new int[][]{{1, 3}, {6, 9}, {10, 11}}, sut.insert(new int[][]{{1, 3}, {6, 9}}, new int[]{10, 11}));
    }

    @Test
    void test_5() {
        assertArrayEquals(new int[][]{{1, 3}, {6, 11}}, sut.insert(new int[][]{{1, 3}, {6, 9}}, new int[]{9, 11}));
    }

    @Test
    void test_6() {
        assertArrayEquals(new int[][]{{0, 3}, {6, 9}}, sut.insert(new int[][]{{1, 3}, {6, 9}}, new int[]{0, 1}));
    }

    @Test
    void test_7() {
        assertArrayEquals(new int[][]{{-1, 0}, {1, 3}, {6, 9}}, sut.insert(new int[][]{{1, 3}, {6, 9}}, new int[]{-1, 0}));
    }
}
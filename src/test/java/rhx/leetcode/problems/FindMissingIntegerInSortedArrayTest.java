package rhx.leetcode.problems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMissingIntegerInSortedArrayTest {

    FindMissingIntegerInSortedArray sut;

    @BeforeEach
    void setup() {
        sut = new FindMissingIntegerInSortedArray();
    }

    @Test
    void test_1() {
        assertEquals(-1, sut.find(new int[]{1}));
    }

    @Test
    void test_2() {
        assertEquals(4, sut.find(new int[]{0, 1, 2, 3, 5, 6, 7, 8, 9}));
    }

    @Test
    void test_3() {
        assertEquals(7, sut.find(new int[]{0, 1, 2, 3, 4, 5, 6, 8, 9}));
    }

    @Test
    void test_4() {
        assertEquals(-1, sut.find(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}));
    }

    @Test
    void test_5() {
        assertEquals(9, sut.find(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 10}));
    }

    @Test
    void test_6() {
        assertEquals(9, sut.find(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 10}));
    }

    @Test
    void test_7() {
        assertEquals(2, sut.find(new int[]{1, 3, 4, 5, 6, 7, 8, 9, 10}));
    }

    @Test
    void test_8() {
        assertEquals(5, sut.find(new int[]{3, 4, 6, 7, 8, 9, 10}));
    }

    @Test
    void test_9() {
        assertEquals(8, sut.find(new int[]{3, 4, 5, 6, 7, 9, 10}));
    }

    @Test
    void test_10() {
        assertEquals(8, sut.find(new int[]{2, 3, 4, 5, 6, 7, 9, 10}));
    }

    @Test
    void test_11() {
        assertEquals(3, sut.find(new int[]{2, 4, 5, 6, 7, 9, 10}));
    }

}
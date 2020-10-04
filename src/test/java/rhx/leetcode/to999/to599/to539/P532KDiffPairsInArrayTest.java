package rhx.leetcode.to999.to599.to539;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P532KDiffPairsInArrayTest {

    private P532KDiffPairsInArray sut;

    @BeforeEach
    void setUp() {
        sut = new P532KDiffPairsInArray();
    }

    @Test
    void test_1() {
        assertEquals(2, sut.findPairs(new int[]{3, 1, 4, 1, 5}, 2));
    }

    @Test
    void test_2() {
        assertEquals(4, sut.findPairs(new int[]{1, 2, 3, 4, 5}, 1));
    }

    @Test
    void test_3() {
        assertEquals(1, sut.findPairs(new int[]{1, 3, 1, 5, 4}, 0));
    }

    @Test
    void test_4() {
        assertEquals(2, sut.findPairs(new int[]{1, 2, 4, 4, 3, 3, 0, 9, 2, 3}, 3));
    }

    @Test
    void test_5() {
        assertEquals(2, sut.findPairs(new int[]{-1, -2, -3}, 1));
    }

    @Test
    void test_6() {
        assertEquals(2, sut.findPairs(new int[]{1, 2, 3, 2, 4, 5, 6, 5, 7}, 0));
    }

    @Test
    void test_7() {
        assertEquals(1, sut.findPairs(new int[]{1, 1, 1, 1, 1}, 0));
    }

}
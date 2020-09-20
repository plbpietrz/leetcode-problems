package rhx.leetcode.to999.to999.to989;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P980UniquePaths3Test {

    private P980UniquePaths3 sut;

    @BeforeEach
    void setUp() {
        sut = new P980UniquePaths3();
    }

    @Test
    void test_1() {
        assertEquals(2, sut.uniquePathsIII(new int[][]{{1, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 2, -1}}));
    }

    @Test
    void test_2() {
        assertEquals(4, sut.uniquePathsIII(new int[][]{{1, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 2}}));
    }

    @Test
    void test_3() {
        assertEquals(0, sut.uniquePathsIII(new int[][]{{0, 1}, {2, 0}}));
    }
}
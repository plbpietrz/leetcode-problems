package rhx.leetcode.to499.to499.to419;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P416PartitionEqualSubsetSumTest {

    P416PartitionEqualSubsetSum sut;

    @BeforeEach
    void setup() {
        sut = new P416PartitionEqualSubsetSum();
    }

    @Test
    void test_1() {
        assertTrue(sut.canPartition(new int[]{1, 5, 11, 5}));
    }

    @Test
    void test_2() {
        assertFalse(sut.canPartition(new int[]{1, 2, 3, 5}));
    }

    @Test
    void test_3() {
        assertTrue(sut.canPartition(new int[]{2, 1, 2, 1}));
    }

    @Test
    void test_4() {
        assertTrue(sut.canPartition(new int[]{2, 2, 1, 1}));
    }

    @Test
    void test_5() {
        assertTrue(sut.canPartition(new int[]{14, 9, 8, 4, 3, 2}));
    }

    @Test
    void test_6() {
        assertFalse(sut.canPartition(new int[]{
                100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100,
                100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100,
                100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100,
                100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100,
                100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100,
                100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100,
                100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100,
                100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100,
                100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100,
                100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100,
                100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100,
                100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100,
                100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100,
                100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100,
                100, 100, 99, 97}));
    }

    @Test
    void test_7() {
        assertTrue(sut.canPartition(new int[]{
                1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                1, 1, 1, 1, 1, 1, 97, 95}));
    }

}
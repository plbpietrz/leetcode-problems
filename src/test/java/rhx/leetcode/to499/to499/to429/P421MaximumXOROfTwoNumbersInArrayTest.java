package rhx.leetcode.to499.to499.to429;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P421MaximumXOROfTwoNumbersInArrayTest {

    private P421MaximumXOROfTwoNumbersInArray sut;

    @BeforeEach
    void setUp() {
        sut = new P421MaximumXOROfTwoNumbersInArray();
    }

    @Test
    void test_1() {
        assertEquals(28, sut.findMaximumXOR(3, 10, 5, 25, 2, 8));
    }

    @Test
    void test_2() {
        assertEquals(6, sut.findMaximumXOR(2,4));
    }

    @Test
    void test_3() {
        assertEquals(1, sut.findMaximumXOR(2147483647, 2147483646));
    }

    @Test
    void test_4() {
        assertEquals(0, sut.findMaximumXOR(1));
    }

    @Test
    void test_5() {
        assertEquals(3, sut.findMaximumXOR(4, 6, 7));
    }
}
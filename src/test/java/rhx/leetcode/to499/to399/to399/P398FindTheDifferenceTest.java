package rhx.leetcode.to499.to399.to399;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P398FindTheDifferenceTest {

    private P398FindTheDifference sut;

    @BeforeEach
    void setUp() {
        sut = new P398FindTheDifference();
    }

    @Test
    void test_1() {
        assertEquals('e', sut.findTheDifference("abcd", "abcde"));
    }

    @Test
    void test_2() {
        assertEquals('e', sut.findTheDifference("abcd", "eabcd"));
    }

    @Test
    void test_3() {
        assertEquals('a', sut.findTheDifference("", "a"));
    }
}
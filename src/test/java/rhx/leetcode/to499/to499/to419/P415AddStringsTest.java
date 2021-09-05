package rhx.leetcode.to499.to499.to419;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P415AddStringsTest {

    P415AddStrings sut;

    @BeforeEach
    void setUp() {
        sut = new P415AddStrings();
    }

    @Test
    void test_1() {
        assertEquals("222", sut.addStrings("111", "111"));
    }

    @Test
    void test_2() {
        assertEquals("123", sut.addStrings("100", "23"));
    }

    @Test
    void test_3() {
        assertEquals(String.valueOf(Integer.MAX_VALUE), sut.addStrings(String.valueOf(Integer.MAX_VALUE - 1), "1"));
    }

    @Test
    void test_4() {
        assertThrows(IllegalArgumentException.class, () -> sut.addStrings("1a1", "3"));
    }

    @Test
    void test_5() {
        assertEquals("20", sut.addStrings("013", "007"));
    }
}
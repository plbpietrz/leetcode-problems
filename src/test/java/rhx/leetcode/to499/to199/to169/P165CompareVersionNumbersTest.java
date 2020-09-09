package rhx.leetcode.to499.to199.to169;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P165CompareVersionNumbersTest {

    private P165CompareVersionNumbers sut;

    @BeforeEach
    void setUp() {
        sut = new P165CompareVersionNumbers();
    }

    @Test
    void test_1() {
        assertEquals(-1, sut.compareVersion("0.1", "1.1"));
    }

    @Test
    void test_2() {
        assertEquals(1, sut.compareVersion("1.0.1", "1"));
    }

    @Test
    void test_3() {
        assertEquals(-1, sut.compareVersion("7.5.2.4", "7.5.3"));
    }

    @Test
    void test_4() {
        assertEquals(0, sut.compareVersion("1.01", "1.001"));
    }

    @Test
    void test_5() {
        assertEquals(0, sut.compareVersion("1.0", "1.0.0"));
    }
}
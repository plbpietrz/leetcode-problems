package rhx.leetcode.to499.to299.to299;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P299BullsAndCowsTest {

    private P299BullsAndCows sut;

    @BeforeEach
    void setUp() {
        sut = new P299BullsAndCows();
    }

    @Test
    void test_1() {
        assertEquals("1A3B", sut.getHint("1807", "7810"));
    }

    @Test
    void test_2() {
        assertEquals("1A1B", sut.getHint("1123", "0111"));
    }
}

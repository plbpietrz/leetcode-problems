package rhx.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem457CircularArrayLoopTest {

    private Problem457CircularArrayLoop sut;

    @BeforeEach
    public void setup() {
        sut = new Problem457CircularArrayLoop();
    }

    @Test
    public void test_1() {
        assertTrue(sut.circularArrayLoop(new int []{2,-1,1,2,2}));
    }

    @Test
    public void test_2() {
        assertFalse(sut.circularArrayLoop(new int []{-1,2}));
    }

    @Test
    public void test_3() {
        assertFalse(sut.circularArrayLoop(new int []{-2,1,-1,-2,-2}));
    }

    @Test
    public void test_4() {
        assertTrue(sut.circularArrayLoop(new int []{3, 1, 2}));
    }

    @Test
    public void test_5() {
        assertFalse(sut.circularArrayLoop(new int []{-1,-2,-3,-4,-5}));
    }
}
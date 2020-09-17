package rhx.leetcode.to1499.to1099.to1049;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P1041RobotBoundedInCycleTest {

    private P1041RobotBoundedInCycle sut;

    @BeforeEach
    void setUp() {
        sut = new P1041RobotBoundedInCycle();
    }

    @Test
    void test_1() {
        assertTrue(sut.isRobotBounded("GGLLGG"));
    }

    @Test
    void test_2() {
        assertFalse(sut.isRobotBounded("GG"));
    }

    @Test
    void test_3() {
        assertTrue(sut.isRobotBounded("GL"));
    }

    @Test
    void test_4() {
        assertTrue(sut.isRobotBounded("GLRLLGLL"));
    }
}
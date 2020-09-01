package rhx.leetcode.problems70to79;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P70ClimbingStairsTest {

    private P70ClimbingStairs sut;

    @BeforeEach
    public void setup() {
        sut = new P70ClimbingStairs();
    }

    @Test
    public void test_1() {
        assertEquals(1, sut.climbStairs(1));
    }

    @Test
    public void test_2() {
        assertEquals(2, sut.climbStairs(2));
    }

    @Test
    public void test_3() {
        assertEquals(3, sut.climbStairs(3));
    }
}
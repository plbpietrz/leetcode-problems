package rhx.leetcode.problems40to49;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P42TrappingRainWaterTest {

    private P42TrappingRainWater sut;

    @BeforeEach
    public void setup() {
        sut = new P42TrappingRainWater();
    }

    @Test
    public void test_0() {
        assertEquals(3, sut.trap(new int[]{0, 2, 1, 0, 3, 0}));
    }

    @Test
    public void test_1() {
        assertEquals(6, sut.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }

    @Test
    public void test_2() {
        assertEquals(0, sut.trap(new int[]{0, 1, 0}));
    }

}
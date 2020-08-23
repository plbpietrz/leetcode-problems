package rhx.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem312BurstBalloonsTest {

    private Problem312BurstBalloons sut;

    @BeforeEach
    public void setup() {
        sut = new Problem312BurstBalloons();
    }

    @Test
    public void test_1() {
        assertEquals(1, sut.maxCoins(new int[]{1}));
    }

    @Test
    public void test_2() {
        assertEquals(9, sut.maxCoins(new int[]{3, 2}));
    }

    @Test
    public void test_3() {
        assertEquals(12, sut.maxCoins(new int[]{3, 2, 1}));
    }

    @Test
    public void test_0() {
        assertEquals(0, sut.maxCoins(new int[]{}));
    }

}
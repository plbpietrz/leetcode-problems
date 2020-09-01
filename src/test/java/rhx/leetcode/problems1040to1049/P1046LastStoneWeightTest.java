package rhx.leetcode.problems1040to1049;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P1046LastStoneWeightTest {

    private P1046LastStoneWeight sut;

    @BeforeEach
    public void setup() {
        sut = new P1046LastStoneWeight();
    }

    @Test
    public void test_1() {
        assertEquals(1, sut.lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1}));
    }

    @Test
    public void test_2() {
        assertEquals(2, sut.lastStoneWeight(new int[]{2}));
    }

    @Test
    public void test_3() {
        assertEquals(0, sut.lastStoneWeight(new int[]{}));
    }

    @Test
    public void test_4() {
        assertEquals(0, sut.lastStoneWeight(new int[]{1, 7, 5, 3}));
    }

}
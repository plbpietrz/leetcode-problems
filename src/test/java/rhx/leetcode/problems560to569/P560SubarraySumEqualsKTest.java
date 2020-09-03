package rhx.leetcode.problems560to569;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P560SubarraySumEqualsKTest {

    private P560SubarraySumEqualsK sut;

    @BeforeEach
    public void setup() {
        sut = new P560SubarraySumEqualsK();
    }

    @Test
    public void test_1() {
        assertEquals(1, sut.subarraySum(new int[]{-1, -1, 1}, 0));
    }

    @Test
    public void test_2() {
        assertEquals(2, sut.subarraySum(new int[]{1, 1, 1}, 2));
    }

    @Test
    public void test_3() {
        assertEquals(1, sut.subarraySum(new int[]{1, 2, 3}, 2));
    }

}
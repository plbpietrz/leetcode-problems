package rhx.leetcode.problems0to9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class P1TwoSumTest {

    P1TwoSum sut;

    @BeforeEach
    public void setUp() {
        sut = new P1TwoSum();
    }

    @Test
    public void testTwoSum1() {
        int target = 9;
        int[] input = {2, 7, 11, 15};
        int[] result = sut.twoSum(input, target);

        assertArrayEquals(new int[]{0, 1}, result);
    }

}
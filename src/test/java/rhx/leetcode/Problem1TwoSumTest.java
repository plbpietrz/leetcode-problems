package rhx.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem1TwoSumTest {

    Problem1TwoSum sut;

    @BeforeEach
    public void setUp() {
        sut = new Problem1TwoSum();
    }

    @Test
    public void testTwoSum1() {
        int target = 9;
        int[] input = {2, 7, 11, 15};
        int[] result = sut.twoSum(input, target);

        assertArrayEquals(new int[]{0, 1}, result);
    }

}
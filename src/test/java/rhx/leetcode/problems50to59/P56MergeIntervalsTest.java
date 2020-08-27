package rhx.leetcode.problems50to59;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class P56MergeIntervalsTest {

    private P56MergeIntervals sut;

    @BeforeEach
    public void setup() {
        sut = new P56MergeIntervals();
    }

    @Test
    public void test_1() {
        int[][] input = {{1,3}, {2,6},{8,10},{15,18}};
        int[][] resut = sut.merge(input);
        assertArrayEquals(new int[][]{{1,6},{8,10},{15,18}}, resut);
    }

    @Test
    public void test_2() {
        int[][] input = {{1,4},{0,1}};
        int[][] resut = sut.merge(input);
        assertArrayEquals(new int[][]{{0, 4}}, resut);
    }

    @Test
    public void test_3() {
        int[][] input = {{1,4},{2,3}};
        int[][] resut = sut.merge(input);
        assertArrayEquals(new int[][]{{1, 4}}, resut);
    }

    @Test
    public void test_4() {
        int[][] input = {{1,4},{4,5}};
        int[][] resut = sut.merge(input);
        assertArrayEquals(new int[][]{{1, 5}}, resut);
    }

}
package rhx.leetcode.to999.to899.to839;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P835ImageOverlapTest {

    private P835ImageOverlap sut;

    @BeforeEach
    public void setup() {
        sut = new P835ImageOverlap();
    }

    @Test
    public void test_1() {
        assertEquals(3, sut.largestOverlap(
                new int[][] {
                        {1, 1, 0},
                        {0, 1, 0},
                        {0, 1, 0}
                },
                new int[][] {
                        {0, 0, 0},
                        {0, 1, 1},
                        {0, 0, 1}
                }
        ));
    }

    @Test
    public void test_2() {
        assertEquals(2, sut.largestOverlap(
                new int[][] {
                        {0, 1},
                        {1, 1}
                },
                new int[][] {
                        {1, 1},
                        {1, 0}
                }
        ));
    }
}
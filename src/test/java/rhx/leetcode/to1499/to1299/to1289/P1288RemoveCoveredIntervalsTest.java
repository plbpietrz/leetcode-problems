package rhx.leetcode.to1499.to1299.to1289;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P1288RemoveCoveredIntervalsTest {

    private P1288RemoveCoveredIntervals sut;

    @BeforeEach
    void setUp() {
        sut = new P1288RemoveCoveredIntervals();
    }

    @Test
    void time_1() {
        assertEquals(2, sut.removeCoveredIntervals(new int[][]{{1, 4}, {3, 6}, {2, 8}}));
    }

    @Test
    void time_2() {
        assertEquals(1, sut.removeCoveredIntervals(new int[][]{{1, 4}, {2, 3}}));
    }

    @Test
    void time_3() {
        assertEquals(2, sut.removeCoveredIntervals(new int[][]{{0, 10}, {5, 12}}));
    }

    @Test
    void time_4() {
        assertEquals(2, sut.removeCoveredIntervals(new int[][]{{3, 10}, {4, 10}, {5, 11}}));
    }

    @Test
    void time_5() {
        assertEquals(1, sut.removeCoveredIntervals(new int[][]{{1, 2}, {1, 4}, {3, 4}}));
    }
}
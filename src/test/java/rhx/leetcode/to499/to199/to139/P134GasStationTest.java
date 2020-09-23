package rhx.leetcode.to499.to199.to139;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P134GasStationTest {

    private P134GasStation sut;

    @BeforeEach
    void setUp() {
        sut = new P134GasStation();
    }

    @Test
    void test_1() {
        assertEquals(3, sut.canCompleteCircuit(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 1, 2}));
    }

    @Test
    void test_2() {
        assertEquals(-1, sut.canCompleteCircuit(new int[]{2, 3, 4}, new int[]{3, 4, 3}));
    }

    @Test
    void test_3() {
        assertEquals(4, sut.canCompleteCircuit(new int[]{5, 1, 2, 3, 4}, new int[]{4, 4, 1, 5, 1}));
    }

    @Test
    void test_4() {
        assertEquals(3, sut.canCompleteCircuit(new int[]{5, 8, 2, 8}, new int[]{6, 5, 6, 6}));
    }
}
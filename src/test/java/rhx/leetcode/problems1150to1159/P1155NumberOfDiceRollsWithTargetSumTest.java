package rhx.leetcode.problems1150to1159;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P1155NumberOfDiceRollsWithTargetSumTest {

    private P1155NumberOfDiceRollsWithTargetSum sut;

    @BeforeEach
    public void setup() {
        sut = new P1155NumberOfDiceRollsWithTargetSum();
    }

    @Test
    public void test_1() {
        assertEquals(1, sut.numRollsToTarget(1, 6, 3));
    }

}
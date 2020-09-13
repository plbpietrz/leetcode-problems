package rhx.leetcode.to499.to299.to219;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class P216CombinationSum3Test {

    private P216CombinationSum3 sut;

    @BeforeEach
    void setUp() {
        sut = new P216CombinationSum3();
    }

    @Test
    void test_1() {
        assertEquals(List.of(List.of(1, 2, 4)), sut.combinationSum3(3, 7));
    }

    @Test
    void test_2() {
        assertEquals(List.of(List.of(1, 2, 6), List.of(1, 3, 5), List.of(2, 3, 4)), sut.combinationSum3(3, 9));
    }
}
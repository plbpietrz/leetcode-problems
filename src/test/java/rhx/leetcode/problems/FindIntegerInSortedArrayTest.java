package rhx.leetcode.problems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindIntegerInSortedArrayTest {

    FindIntegerInSortedArray sut;

    @BeforeEach
    void setup() {
        sut = new FindIntegerInSortedArray();
    }

    @Test
    void test_1() {
        assertEquals(2, sut.solution(new int[]{1, 2, 5, 9, 9}, 5));
    }

    @Test
    void test_2() {
        assertEquals(3, sut.solution(new int[]{0, 1, 2, 5, 9, 9}, 5));
    }

    @Test
    void test_3() {
        assertEquals(0, sut.solution(new int[]{5}, 5));
    }

    @Test
    void test_4() {
        assertEquals(-1, sut.solution(new int[]{5}, 1));
    }

    @Test
    void test_5() {
        assertEquals(5, sut.solution(new int[]{0, 1, 2, 5, 9, 9}, 9));
    }

    @Test
    void test_6() {
        assertEquals(6, sut.solution(new int[]{0, 1, 2, 5, 5, 6, 9}, 9));
    }

    @Test
    void test_7() {
        assertEquals(0, sut.solution(new int[]{0, 1, 2, 5, 5, 6, 9}, 0));
    }

    @Test
    void test_8() {
        assertEquals(9, sut.solution(new int[]{0, 1, 1, 1, 1, 2, 5, 5, 6, 9}, 9));
    }
}
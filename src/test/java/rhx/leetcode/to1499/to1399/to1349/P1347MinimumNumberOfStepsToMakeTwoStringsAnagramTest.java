package rhx.leetcode.to1499.to1399.to1349;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P1347MinimumNumberOfStepsToMakeTwoStringsAnagramTest {

    P1347MinimumNumberOfStepsToMakeTwoStringsAnagram sut;

    @BeforeEach
    void setup() {
        sut = new P1347MinimumNumberOfStepsToMakeTwoStringsAnagram();
    }

    @Test
    void test_1() {
        assertEquals(1, sut.minSteps("bab", "aba"));
    }

    @Test
    void test_2() {
        assertEquals(5, sut.minSteps("leetcode", "practice"));
    }

    @Test
    void test_3() {
        assertEquals(0, sut.minSteps("anagram", "mangaar"));
    }

    @Test
    void test_4() {
        assertEquals(0, sut.minSteps("xxyyzz", "xxyyzz"));
    }

    @Test
    void test_5() {
        assertEquals(4, sut.minSteps("friend", "family"));
    }
}
package rhx.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem3LongestSubstringTest {

    private Problem3LongestSubstring sut;

    @BeforeEach
    void setUp() {
        sut = new Problem3LongestSubstring();
    }

    @Test
    public void testLengthOfLongestSubstring1() {
        int expected = 3;
        String input = "abcabcbb";
        int result = sut.lengthOfLongestSubstring(input);
        assertEquals(expected, result);
    }

    @Test
    public void testLengthOfLongestSubstring2() {
        int expected = 1;
        String input = "bbbbb";
        int result = sut.lengthOfLongestSubstring(input);
        assertEquals(expected, result);
    }

    @Test
    public void testLengthOfLongestSubstring3() {
        int expected = 3;
        String input = "pwwkew";
        int result = sut.lengthOfLongestSubstring(input);
        assertEquals(expected, result);
    }

    @Test
    public void testLengthOfLongestSubstring4() {
        int expected = 2;
        String input = "aab";
        int result = sut.lengthOfLongestSubstring(input);
        assertEquals(expected, result);
    }

}
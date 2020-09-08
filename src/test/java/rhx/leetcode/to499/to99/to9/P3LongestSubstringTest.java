package rhx.leetcode.to499.to99.to9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P3LongestSubstringTest {

    private P3LongestSubstring sut;

    @BeforeEach
    void setUp() {
        sut = new P3LongestSubstring();
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
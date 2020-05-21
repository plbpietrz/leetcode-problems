package rhx.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
        Assertions.assertEquals(result, expected);
    }

    @Test
    public void testLengthOfLongestSubstring2() {
        int expected = 1;
        String input = "bbbbb";
        int result = sut.lengthOfLongestSubstring(input);
        Assertions.assertEquals(result, expected);
    }

    @Test
    public void testLengthOfLongestSubstring3() {
        int expected = 3;
        String input = "pwwkew";
        int result = sut.lengthOfLongestSubstring(input);
        Assertions.assertEquals(result, expected);
    }

}
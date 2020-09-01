package rhx.leetcode.problems0to9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P5LongestPalindromicSubstringTest {

    private P5LongestPalindromicSubstring sut;

    @BeforeEach
    public void setup() {
        sut = new P5LongestPalindromicSubstring();
    }

    @Test
    public void test_1() {
        assertEquals("bab", sut.longestPalindrome("babad"));
    }

    @Test
    public void test_2() {
        assertEquals("a", sut.longestPalindrome("a"));
    }

    @Test
    public void test_3() {
        assertEquals("", sut.longestPalindrome(""));
    }

    @Test
    public void test_4() {
        assertEquals(" abcba ", sut.longestPalindrome("aaa acdc abcba supps"));
    }

}
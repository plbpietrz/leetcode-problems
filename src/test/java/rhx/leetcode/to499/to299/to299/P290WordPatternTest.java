package rhx.leetcode.to499.to299.to299;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P290WordPatternTest {

    private P290WordPattern sut;

    @BeforeEach
    public void setup() {
        sut = new P290WordPattern();
    }

    @Test
    public void test_1() {
        assertTrue(sut.wordPattern("abba", "cat dog dog cat"));
    }

    @Test
    public void test_2() {
        assertTrue(sut.wordPattern("abcbac", "cat dog fish dog cat fish"));
    }

    @Test
    public void test_3() {
        assertFalse(sut.wordPattern("abcbac", "cat dog fish cat fish"));
    }
}
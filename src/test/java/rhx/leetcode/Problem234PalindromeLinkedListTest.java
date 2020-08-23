package rhx.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem234PalindromeLinkedListTest {

    private Problem234PalindromeLinkedList sut;

    @BeforeEach
    public void setup() {
        sut = new Problem234PalindromeLinkedList();
    }

    @Test
    public void test_empty() {
        assertTrue(sut.isPalindrome(null));
    }

    @Test
    public void test_1() {
        assertTrue(sut.isPalindrome(ListNode.of(1)));
    }

    @Test
    public void test_123() {
        assertFalse(sut.isPalindrome(ListNode.of(1, 2, 3)));
    }

    @Test
    public void test_1232() {
        assertFalse(sut.isPalindrome(ListNode.of(1, 2, 3, 2)));
    }

    @Test
    public void test_12321() {
        assertTrue(sut.isPalindrome(ListNode.of(1, 2, 3, 2, 1)));
    }

    @Test
    public void test_123321() {
        assertTrue(sut.isPalindrome(ListNode.of(1, 2, 3, 3, 2, 1)));
    }

}
package rhx.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem215KthLargesElementInArrayTest {

    private Problem215KthLargesElementInArray sut;

    @BeforeEach
    public void setup() {
        sut = new Problem215KthLargesElementInArray();
    }

    @Test
    public void test_1() {
        assertEquals(5, sut.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));
    }

    @Test
    public void test_2() {
        assertEquals(4, sut.findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));
    }

    @Test
    public void test_3() {
        assertEquals(4, sut.findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));
    }

    @Test
    public void test_4() {
        assertEquals(1, sut.findKthLargest(new int[]{1, 2}, 2));
    }

    @Test
    public void test_5() {
        assertEquals(1, sut.findKthLargest(new int[]{1}, 1));
    }
}
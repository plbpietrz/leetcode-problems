package rhx.leetcode.to499.to99.to39;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P33SearchInRotatedArrayTest {

    private P33SearchInRotatedArray sut;

    @BeforeEach
    public void setup() {
        sut = new P33SearchInRotatedArray();
    }

    @Test
    public void test_1() {
        assertEquals(4, sut.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
    }

    @Test
    public void test_2() {
        assertEquals(3, sut.search(new int[]{4, 5, 6, 7, 8, 0, 1, 2}, 7));
    }

    @Test
    public void test_3() {
        assertEquals(0, sut.search(new int[]{4, 5, 6, 7, 8, 0, 1, 2}, 4));
    }

    @Test
    public void test_4() {
        assertEquals(7, sut.search(new int[]{4, 5, 6, 7, 8, 0, 1, 2}, 2));
    }

    @Test
    public void test_5() {
        assertEquals(1, sut.search(new int[]{3, 1}, 1));
    }

    @Test
    public void test_6() {
        assertEquals(0, sut.search(new int[]{3, 1}, 3));
    }
}
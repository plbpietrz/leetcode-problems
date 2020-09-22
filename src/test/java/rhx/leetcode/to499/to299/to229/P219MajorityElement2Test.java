package rhx.leetcode.to499.to299.to229;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class P219MajorityElement2Test {

    private P219MajorityElement2 sut;

    @BeforeEach
    void setUp() {
        sut = new P219MajorityElement2();
    }

    @Test
    void test_1() {
        assertIterableEquals(List.of(1, 2), sut.majorityElement(1, 1, 1, 3, 3, 2, 2, 2));
    }

    @Test
    void test_2() {
        assertIterableEquals(List.of(3), sut.majorityElement(3,2,3));
    }

    @Test
    void test_3() {
        assertIterableEquals(List.of(-2147483648), sut.majorityElement(-2147483648));
    }
}
package rhx.leetcode.to1499.to1299.to1299;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class P1291SequentialDigitsTest {

    private P1291SequentialDigits sut;

    @BeforeEach
    void setUp() {
        sut = new P1291SequentialDigits();
    }

    @Test
    void test_1() {
        assertIterableEquals(List.of(123, 234), sut.sequentialDigits(100, 300));
    }

    @Test
    void test_2() {
        assertIterableEquals(List.of(1234, 2345, 3456, 4567, 5678, 6789, 12345), sut.sequentialDigits(1000, 13000));
    }

    @Test
    void test_3() {
        assertIterableEquals(List.of(2345, 3456, 4567, 5678, 6789), sut.sequentialDigits(2345, 6789));
    }

    @Test
    void test_4() {
        assertIterableEquals(List.of(3456, 4567, 5678, 6789), sut.sequentialDigits(2346, 6789));
    }

    @Test
    void test_5() {
        assertIterableEquals(List.of(12, 23, 34, 45, 56, 67, 78, 89, 123, 234, 345, 456, 567, 678, 789, 1234, 2345, 3456, 4567, 5678, 6789, 12345, 23456, 34567, 45678, 56789, 123456, 234567, 345678, 456789, 1234567, 2345678, 3456789, 12345678, 23456789, 123456789), sut.sequentialDigits(10, 1000000000));
    }

    @Test
    void test_6() {
        assertIterableEquals(List.of(12345, 23456), sut.sequentialDigits(8511, 23553));
    }

    @Test
    void test_7() {
        assertIterableEquals(Collections.emptyList(), sut.sequentialDigits(178546104, 812704742));
    }

    @Test
    void test_8() {
        assertIterableEquals(List.of(123456789), sut.sequentialDigits(31365477, 514800930));
    }

    @Test
    void test_9() {
        assertIterableEquals(List.of(123456789), sut.sequentialDigits(28932835, 733240848));
    }
}
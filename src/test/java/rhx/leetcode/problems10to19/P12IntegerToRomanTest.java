package rhx.leetcode.problems10to19;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P12IntegerToRomanTest {

    private P12IntegerToRoman sut;

    @BeforeEach
    public void setup() {
        sut = new P12IntegerToRoman();
    }

    @Test
    public void test_1() {
        assertEquals("I", sut.intToRoman(1));
    }

    @Test
    public void test_3() {
        assertEquals("III", sut.intToRoman(3));
    }

    @Test
    public void test_4() {
        assertEquals("IV", sut.intToRoman(4));
    }

    @Test
    public void test_9() {
        assertEquals("IX", sut.intToRoman(9));
    }

    @Test
    public void test_58() {
        assertEquals("LVIII", sut.intToRoman(58));
    }

    @Test
    public void test_1994() {
        assertEquals("MCMXCIV", sut.intToRoman(1994));
    }

}
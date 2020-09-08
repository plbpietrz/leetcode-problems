package rhx.leetcode.to1499.to1199.to1169;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P1160FindWordsFormedByCharsTest {

    private P1160FindWordsFormedByChars sut;

    @BeforeEach
    public void setup() {
        sut = new P1160FindWordsFormedByChars();
    }

    @Test
    public void test_1() {
        assertEquals(6, sut.countCharacters(new String[]{"cat","bt","hat","tree"}, "atach"));
    }

    @Test
    public void test_2() {
        assertEquals(10, sut.countCharacters(new String[]{"hello","world","leetcode"}, "welldonehoneyr"));
    }

}
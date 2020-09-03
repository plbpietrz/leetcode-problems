package rhx.leetcode.problems670to679;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class P678ValidParenthesisStringTest {
    
    private P678ValidParenthesisString sut;

    @BeforeEach
    public void setup() {
        sut = new P678ValidParenthesisString();
    }

    @Test
    public void test_1() {
        assertEquals(true, sut.checkValidString("()"));
    }

    @Test
    public void test_2() {
        assertEquals(true, sut.checkValidString("(*)"));
    }

    @Test
    public void test_3() {
        assertEquals(true, sut.checkValidString("()()"));
    }

    @Test
    public void test_4() {
        assertEquals(true, sut.checkValidString("(*())"));
    }

    @Test
    public void test_5() {
        assertEquals(true, sut.checkValidString("((*)"));
    }

    @Test
    public void test_6() {
        assertEquals(false, sut.checkValidString(")("));
    }

    @Test
    public void test_7() {
        assertEquals(false, sut.checkValidString("())"));
    }

    @Test
    public void test_8() {
        assertEquals(false, sut.checkValidString("(()"));
    }

    @Test
    public void test_9() {
        assertEquals(false, sut.checkValidString("(*(()"));
    }
}

package rhx.leetcode.to499.to199.to199;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class P198HouseRobbersTest {

    private P198HouseRobbers sut;

    @BeforeEach
    public void setup() {
        sut = new P198HouseRobbers();
    }

    @Test
    public void test_1() {
        assertEquals(4, sut.rob(new int[] { 1, 2, 3, 1 }));
    }

    @Test
    public void test_2() {
        assertEquals(12, sut.rob(new int[] { 2, 7, 9, 3, 1 }));
    }
}

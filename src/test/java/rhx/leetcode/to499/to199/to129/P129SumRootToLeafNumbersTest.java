package rhx.leetcode.to499.to199.to129;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import rhx.leetcode.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class P129SumRootToLeafNumbersTest {

    private P129SumRootToLeafNumbers sut;

    @BeforeEach
    public void setup() {
        sut = new P129SumRootToLeafNumbers();
    }

    @Test
    void test_1() {
        assertEquals(22, sut.sumRootToLeaf(TreeNode.from(1, 0, 1, 0, 1, 0, 1)));
    }

    @Test
    void test_2() {
        assertEquals(16, sut.sumRootToLeaf(TreeNode.from(1, 1, 1, null, null, 0, 1)));
    }

    @Test
    @Disabled
    void test_3() {
        assertEquals(55, sut.sumRootToLeaf(TreeNode.from(1, 1, 1, null, null, 0, 1, null, null, 1, 1, null, null, null, 1)));
    }
}
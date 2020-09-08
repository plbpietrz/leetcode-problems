package rhx.leetcode.to999.to599.to549;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rhx.leetcode.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class P543DiameterOfBinaryTreeTest {

    private P543DiameterOfBinaryTree sut;

    @BeforeEach
    public void setup() {
        sut = new P543DiameterOfBinaryTree();
    }

    @Test
    public void test_0() {
        assertEquals(0, sut.diameterOfBinaryTree(TreeNode.from(new Integer[]{0})));
    }

    @Test
    public void test_1() {
        assertEquals(1, sut.diameterOfBinaryTree(TreeNode.from(new Integer[]{1, 2})));
    }

    @Test
    public void test_2() {
        assertEquals(3, sut.diameterOfBinaryTree(TreeNode.from(new Integer[]{1, 2, 3, 4, 5})));
    }

}
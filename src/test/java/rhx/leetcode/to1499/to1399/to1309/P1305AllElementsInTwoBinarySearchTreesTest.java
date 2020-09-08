package rhx.leetcode.to1499.to1399.to1309;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rhx.leetcode.TreeNode;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P1305AllElementsInTwoBinarySearchTreesTest {

    private P1305AllElementsInTwoBinarySearchTrees sut;

    @BeforeEach
    public void setup() {
        sut = new P1305AllElementsInTwoBinarySearchTrees();
    }

    @Test
    public void test_1() {
        assertEquals(List.of(0, 1, 1, 2, 3, 4), sut.getAllElements(TreeNode.from(2, 1, 4), TreeNode.from(1, 0, 3)));
    }

    @Test
    public void test_2() {
        assertEquals(List.of(-10, 0, 0, 1, 2, 5, 7, 10), sut.getAllElements(TreeNode.from(0, -10, 10), TreeNode.from(5, 1, 7, 0, 2)));
    }

    @Test
    public void test_3() {
        assertEquals(List.of(0, 1, 2, 5, 7), sut.getAllElements(null, TreeNode.from(5, 1, 7, 0, 2)));
    }

    @Test
    public void test_4() {
        assertEquals(List.of(-10, 0, 10), sut.getAllElements(TreeNode.from(0, -10, 10), null));
    }

    @Test
    public void test_5() {
        assertEquals(List.of(1, 1, 8, 8), sut.getAllElements(TreeNode.from(1, null, 8), TreeNode.from(8, 1)));
    }

}
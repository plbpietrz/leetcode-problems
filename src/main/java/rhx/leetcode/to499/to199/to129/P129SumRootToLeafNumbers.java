package rhx.leetcode.to499.to199.to129;

import rhx.leetcode.TreeNode;

public class P129SumRootToLeafNumbers {

    private int sum = 0;
    private int[] lookup = new int[1024];

    public int sumRootToLeaf(TreeNode root) {
        sum(root, 0, 0);
        return sum;
    }

    private void sum(TreeNode node, int num, int lvl) {
        if (node.left != null) {
            sum(node.left, (node.val == 1 ? num ^ (1 << lvl) : num), lvl + 1);
        }
        if (node.right != null) {
            sum(node.right, (node.val == 1 ? num ^ (1 << lvl) : num), lvl + 1);
        }
        if (node.left == null && node.right == null) {
            if (node.val == 1)
                num = num ^ (1 << lvl);
            sum += reverse(num, lvl);
        }
    }

    private int reverse(int num, int bits) {
        int x = num;
        int b = 0;
        while (bits > -1) {
            b <<= 1;
            b |= (x & 1);
            x >>= 1;
            bits -= 1;
        }
        return b;
    }

}

package rhx.leetcode.to499.to199.to129;

import rhx.leetcode.TreeNode;

public class P124BinaryTreeMaxPathSum {

    private int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        sum(root);
        return max;
    }

    int sum(TreeNode node) {
        int left = 0, right = 0;
        if (node.right != null) {
            right = sum(node.right);
        }

        if (node.left != null) {
            left = sum(node.left);
        }

        int sum = node.val + left + right;
        max = Math.max(max, sum);
        sum = node.val + Math.max(left, right);
        return sum > 0 ? sum : 0;
    }
}

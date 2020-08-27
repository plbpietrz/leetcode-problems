package rhx.leetcode.problems120to129;

import rhx.leetcode.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class P124BinaryTreeMaxPathSum {

    public int maxPathSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int sum = 0;
        int max = 0;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            sum += node.val;
            if (node.right != null) {
                queue.offer(node.right);
            } else {
                max = Math.max(sum , max);
                sum -= node.val;
                if (node.left != null)
                    queue.offer(node.left);
            }
        }
        return max;
    }
}

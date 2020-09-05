package rhx.leetcode.problems1300to1309;

import rhx.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class P1305AllElementsInTwoBinarySearchTrees {

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        Deque<TreeNode> q1 = new LinkedList<>();
        Deque<TreeNode> q2 = new LinkedList<>();
        List<Integer> r = new ArrayList<>();

        addLeft(root1, q1);
        addLeft(root2, q2);

        while (!(q1.isEmpty() && q2.isEmpty())) {
            TreeNode n1 = q1.pollFirst();
            TreeNode n2 = q2.pollFirst();

            if (n1 != null && n2 != null) {
                if (n1.val < n2.val) {
                    r.add(n1.val);
                    addLeft(n1.right, q1);
                    q2.offerFirst(n2);
                } else {
                    r.add(n2.val);
                    addLeft(n2.right, q2);
                    q1.offerFirst(n1);
                }
            } else if (n1 != null) {
                r.add(n1.val);
                addLeft(n1.right, q1);
            } else {
                r.add(n2.val);
                addLeft(n2.right, q2);
            }

        }

        return r;
    }

    public void addLeft(TreeNode node, Deque<TreeNode> q) {
        while (node != null) {
            q.offerFirst(node);
            node = node.left;
        }
    }

}

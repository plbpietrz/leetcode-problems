package rhx.leetcode.problems540to549;

import rhx.leetcode.TreeNode;

public class P543DiameterOfBinaryTree {

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;

        Pair l = dfs(root.left);
        Pair r = dfs(root.right);

        return Math.max(Math.max(l.len + r.len, l.dia), r.dia);
    }

    static Pair dfs(TreeNode root) {
        if (root == null)
            return new Pair(0,0);
        else if(root.left == null && root.right == null)
            return new Pair(1, 0);

        Pair l = dfs(root.left);
        Pair r = dfs(root.right);

        return new Pair(
                Math.max(l.len, r.len) + 1,
                Math.max(Math.max(l.len + r.len, l.dia), r.dia)
        );
    }

    static class Pair {
        int len;
        int dia;

        Pair(int len, int dia) {
            this.len = len;
            this.dia = dia;
        }
    }

}

package rhx.leetcode;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static TreeNode from(Integer[] binaryTree) {
        if (binaryTree.length == 0)
            return null;
        TreeNode[] aux = new TreeNode[binaryTree.length];
        aux[0] = new TreeNode(binaryTree[0]);
        for (int i = 1; i < binaryTree.length; ++i) {
            if (binaryTree[i] != null) {
                aux[i] = new TreeNode(binaryTree[i]);
                if (i % 2 == 0)
                    aux[i / 2].left = aux[i];
                else
                    aux[i / 2].right = aux[i];
            }
        }
        return aux[0];
    }
}

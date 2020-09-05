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

    public static TreeNode from(Integer ... binaryTree) {
        if (binaryTree.length == 0)
            return null;
        TreeNode[] aux = new TreeNode[binaryTree.length + 1];
        aux[1] = new TreeNode(binaryTree[0]);
        for (int i = 2; i <= binaryTree.length; ++i) {
            if (binaryTree[i-1] != null) {
                aux[i] = new TreeNode(binaryTree[i-1]);
                if (i % 2 == 0)
                    aux[i / 2].left = aux[i];
                else
                    aux[i / 2].right = aux[i];
            }
        }
        return aux[1];
    }

    @Override
    public String toString() {
        return String.format("(%d, %s, %s)",
                val,
                left != null ? left.val : null,
                right != null ? right.val : null);
    }
}

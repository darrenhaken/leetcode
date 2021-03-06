package binarytree;


public class InvertBinaryTree {

    /*
     Invert a tree from:
             4
            /  \
           2    7
          / \   /\
         1   3 6  9
     to:
             4
            /  \
           7    2
          / \   /\
         9   6 3  1
     */
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode right = invertTree(root.right);
        TreeNode left = invertTree(root.left);
        root.left = right;
        root.right = left;
        return root;
    }
}

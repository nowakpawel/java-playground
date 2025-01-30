package pl.pawel.demo.algotithms;

public class BinarySearchTree {
    TreeNode root;

    public void insert(int value) {
        insert(this.root, value);
    }

    private TreeNode insert(TreeNode root, int value) {
        if (root == null) {
            root = new TreeNode();
            root.data = value;
        } else if (value < root.data) {
            //insert on left
            root.left = insert(root.left, value);
        } else if (value > root.data) {
            //insert on right
            root.right = insert(root.right, root.data);
        }

        return root;
    }

}

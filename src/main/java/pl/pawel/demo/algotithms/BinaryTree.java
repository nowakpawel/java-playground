package pl.pawel.demo.algotithms;

public class BinaryTree {
    TreeNode root;

    public void preOrderTraversal() {
        preOrderTraversal(this.root);
    }

    public void postOrderTraversal() {
        postOrderTraversal(this.root);
    }

    public void inOrderTraversal() {
        inOrderTraversal(this.root);
    }

    public int findHeight(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int leftHeight = findHeight(root.left);
            int leftHRight = findHeight(root.right);

            return Math.max(leftHeight, leftHRight) + 1;
        }
    }

    private void preOrderTraversal(TreeNode root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }

    private void inOrderTraversal(TreeNode root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }
    }

    private void postOrderTraversal(TreeNode root) {
        if (root != null) {
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.data + " ");
        }
    }
}

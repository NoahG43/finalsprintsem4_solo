package tree;

public class TreeNode {
    int key;
    TreeNode left;
    TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int key) {
        this.key = key;
    }

    public TreeNode(int key, TreeNode left, TreeNode right) {
        this.key = key;
        this.left = left;
        this.right = right;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "key=" + key +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}

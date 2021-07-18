package Data_Structures.trees;

public class BinarySearchNode {
    int value;
    BinarySearchNode right;
    BinarySearchNode left;

    public BinarySearchNode(int value) {
        this.value = value;
        this.right = null;
        this.left = null;
    }

    public BinarySearchNode getLeft() {
        return left;
    }

    public void setLeft(BinarySearchNode left) {
        this.left = left;
    }

    public BinarySearchNode getRight() {
        return right;
    }

    public void setRight(BinarySearchNode right) {
        this.right = right;
    }

    public int getValue() {
        return value;
    }
}

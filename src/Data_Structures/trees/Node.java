package Data_Structures.trees;

public class Node {
    int value;
    Node right;
    Node left;

    public Node(int value) {
        this.value = value;
        this.right = null;
        this.left = null;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public int getValue() {
        return value;
    }
}

package BinaricTrees;


public class BinaryNode {
    private int value;
    public BinaryNode left;
    public BinaryNode right;

    public BinaryNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public BinaryNode(BinaryNode left, int value, BinaryNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public BinaryNode getLeft() {
        return this.left;
    }

    public BinaryNode getRight() {
        return this.right;
    }

    public void setLeft(BinaryNode left) {
        this.left = left;
    }

    public void setRight(BinaryNode right) {
        this.right = right;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean hasLeft() {
        return this.left != null;
    }

    public boolean hasRight() {
        return this.right != null;
    }

    public String toString() {
        return " " + this.value;
    }
}



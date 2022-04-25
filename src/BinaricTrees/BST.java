package BinaricTrees;


public class BST {

    private BinaryNode root;

    public BST(int value) {
        this.root = new BinaryNode(value);
    }

    public BST() {
        this.root = null;
    }

    public void add(int value) {
        this.root = add(root, value);
    }

    private BinaryNode add(BinaryNode root, int value) {
        if (root == null)
            return new BinaryNode(value);
        if (value < root.getValue())
            root.setLeft(add(root.getLeft(), value));
        else
            root.setRight(add(root.getRight(), value));

        return root;
    }

    public void inOrder() {
        inOrder(this.root);
    }

    private void inOrder(BinaryNode root) {
        if (root != null) {
            inOrder(root.getLeft());
            System.out.printf("%d ", root.getValue());
            inOrder(root.getRight());
        }
    }
}




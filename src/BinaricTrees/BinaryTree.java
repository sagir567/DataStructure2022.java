package BinaricTrees;


public class BinaryTree {




    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree(17);
        bt.root.setLeft(new BinaryNode(36));
        bt.root.setRight(new BinaryNode(12));
        // 36 17 12
        bt.inOrder();

    }

    public BinaryNode root;

    public BinaryTree() {
        this.root = null;
    }

    public void add(int value) {
        root = addRecursive(root, value);
    }
    private BinaryNode addRecursive(BinaryNode root, int value) {
        if (root == null) {
            return new BinaryNode(value);
        }

        if (value < root.getValue()) {
            root.left = addRecursive(root.left, value);
        } else if (value > root.getValue()) {
            root.right = addRecursive(root.right, value);
        } else {
            // value already exists
            return root;
        }

        return root;
    }

    public BinaryTree(int rootValue) {
        this.root = new BinaryNode(rootValue);
    }

    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(BinaryNode root) {
        if (root != null) {
            inOrder(root.getLeft());
            System.out.printf("%d ", root.getValue());
            inOrder(root.getRight());
        }
    }
    public static boolean isBST(BinaryNode root, BinaryNode prev)
    {
        // base case: empty tree is a BST
        if (root == null) {
            return true;
        }

        // check if the left subtree is BST or not
        boolean left = isBST(root.left, prev);

        // value of the current node should be more than that of the previous node
        if (root.getValue() <= prev.getValue()) {
            return false;
        }

        // update previous node data and check if the right subtree is BST or not
        prev.setValue(root.getValue()) ;

        return left && isBST(root.right, prev);
    }

    public static void isBST(BinaryNode node)
    {
        // pointer to store previously processed node in the inorder traversal
        BinaryNode prev = new BinaryNode(Integer.MIN_VALUE);

        // check if nodes are processed in sorted order
        if (isBST(node, prev)) {
            System.out.println("The tree is a BST.");
        }
        else {
            System.out.println("The tree is not a BST!");
        }
    }

}
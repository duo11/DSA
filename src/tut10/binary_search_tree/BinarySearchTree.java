package tut10.binary_search_tree;

public class BinarySearchTree {
    BSTNode root;
    BinarySearchTree leftSubTree;
    BinarySearchTree rightSubTree;

    public BinarySearchTree() {
        this.root = null;
        this.leftSubTree = null;
        this.rightSubTree = null;
    }

    public void addRoot(int value) {
        if (isEmpty())
            root = new BSTNode(value);

        else
            System.out.println("Root already exists!");
    }

    public boolean isEmpty() {
        return root == null;
    }

    public int getTreeValue() {
        return root == null ? Integer.MIN_VALUE : root.getValue();
    }

    public BinarySearchTree getRightSubTree() {
        return rightSubTree;
    }

    public BinarySearchTree getLeftSubTree() {
        return leftSubTree;
    }

    public void setRightSubTree(BinarySearchTree right) {
        this.rightSubTree = right;
    }

    public void setLeftSubTree(BinarySearchTree left) {
        this.leftSubTree = left;
    }

    public boolean insert(int key, BinarySearchTree t) {
        if (t.isEmpty()) {
            t.addRoot(key);
            return true;
        }

        else {
            if (key < t.getTreeValue()) {
                if (t.getLeftSubTree() == null) {
                    t.setLeftSubTree(new BinarySearchTree());
                }

                return insert(key, t.getLeftSubTree());
            }

            else if (key > t.getTreeValue()) {
                if (t.getRightSubTree() == null) {
                    t.setRightSubTree(new BinarySearchTree());
                }

                return insert(key, t.getRightSubTree());
            }

            else
                return false; // key exists (duplicate)
        }
    }

    public int getMax(BinarySearchTree t) {
        if (t.getRightSubTree() == null)
            return t.getTreeValue();

        return getMax(t.getRightSubTree());
    }

    public int getMin(BinarySearchTree t) {
        if (t.getLeftSubTree() == null)
            return t.getTreeValue();

        return getMin(t.getLeftSubTree());
    }

    public boolean search(int key, BinarySearchTree t) {
        if (t.isEmpty())
            return false;

        if (key == t.getTreeValue())
            return true;

        else if (key < t.getTreeValue() && t.getLeftSubTree() != null)
            return search(key, t.getLeftSubTree());

        else if (key > t.getTreeValue() && t.getRightSubTree() != null)
            return search(key, t.getRightSubTree());

        else
            return false;
    }

    public void preOrderTraversal(BinarySearchTree t) {
        if (t != null && !t.isEmpty()) {
            System.out.print(t.getTreeValue() + " ");
            preOrderTraversal(t.getLeftSubTree());
            preOrderTraversal(t.getRightSubTree());
        }
    }
}
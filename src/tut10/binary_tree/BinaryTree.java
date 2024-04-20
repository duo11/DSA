package tut10.binary_tree;


import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    private BTNode root;
    private BinaryTree leftSubTree;
    private BinaryTree rightSubTree;

    public BinaryTree(){
        root = null;
        leftSubTree = null;
        rightSubTree = null;
    }
    public BinaryTree(String rootValue){
        root = new BTNode(rootValue);
        leftSubTree = null;
        rightSubTree = null;
    }

    public void buildTree(String rootValue,BinaryTree left, BinaryTree right){
        root = new BTNode(rootValue);
        leftSubTree = left;
        rightSubTree = right;
    }

    public void buildTreeByValue(String rootValue,String leftValue,String rightValue) {
        root = new BTNode(rootValue);
        leftSubTree = new BinaryTree(leftValue) ;
        rightSubTree = new BinaryTree(rightValue);
    }

    public boolean isEmpty() {
        return root == null;
    }
    public void makeEmpty() {
        root = null;
        leftSubTree = null;
        rightSubTree = null;
    }

    public String getTreeValue(){
        return root.getLabel();
    }


    public void setTreeValue(String label){
        this.root.setLabel(label);
    }

    public boolean isLeaf() {
        return leftSubTree == null && rightSubTree == null;
    }

    public BinaryTree getLeftSubTree() {
        return leftSubTree;
    }
    public BinaryTree getRightSubTree() {
        return rightSubTree;
    }
    public void setLeftSubTree(BinaryTree left) {
        leftSubTree = left;
    }
    public void setRightSubTree(BinaryTree right) {
        rightSubTree = right;
    }
    public void preOrderTraversal(BinaryTree t) {
        if(t != null) {
            System.out.print(t.root + " ");
            preOrderTraversal(t.getLeftSubTree());
            preOrderTraversal(t.getRightSubTree());
        }

    }
    public void inOrderTraversal(BinaryTree t) {
        if(t != null) {
            inOrderTraversal(t.getLeftSubTree());
            System.out.print(t.root + " ");
            inOrderTraversal(t.getRightSubTree());
        }

    }
    public void postOrderTraversal(BinaryTree t) {
        if(t != null) {
            postOrderTraversal(t.leftSubTree);
            postOrderTraversal(t.rightSubTree);
            System.out.print(t.root + " ");
        }

    }



    public int getDepth() {
        if (root == null){
            return 0;
        }

        Queue<BinaryTree> queue = new LinkedList<>();
        queue.offer(this); // Enqueue the root node
        int depth = -1;

        while (!queue.isEmpty()) {
            int size = queue.size();
            depth++;

            // Iterate through nodes at the current level
            while (size-- > 0) {
                BinaryTree node = queue.poll();

                // Enqueue child nodes if they exist
                if (node.leftSubTree != null)
                    queue.offer(node.leftSubTree);
                if (node.rightSubTree != null)
                    queue.offer(node.rightSubTree);
            }
        }

        return depth;
    }
    public int getDepth(BinaryTree t) {
        if (t==null)
            return 0;
        if (t.isLeaf())
            return 0;
        int leftSubTreeDepth=0;
        leftSubTreeDepth=getDepth(t.getLeftSubTree());
        int rightSubTreeDepth=0;
        rightSubTreeDepth=getDepth(t.getRightSubTree());
        if (leftSubTreeDepth > rightSubTreeDepth)
            return 1+leftSubTreeDepth;
        else
            return 1+rightSubTreeDepth;
    }



    public int countLeaves(BinaryTree t){
        if(t == null){
            return 0;
        }
        if(t.isLeaf()) {
            return 1;
        }
        else{
            return countLeaves(t.getLeftSubTree()) + countLeaves(t.getRightSubTree());
        }
    }
    public int iPathLength(BinaryTree t) {


        int ipl = 0;

        Queue<BinaryTree> nodeList = new LinkedList<>();
        Queue<Integer> levelList = new LinkedList<>();
        nodeList.offer(t);
        int level = 0;
        while (!nodeList.isEmpty()){
            int size = nodeList.size();
            level++;
            for(int i = 0; i < size;i++) {
                BinaryTree tree = nodeList.poll();
                if(tree.leftSubTree != null) {
                    nodeList.offer(tree.leftSubTree);
                    levelList.offer(level);

                }
                if(tree.rightSubTree != null) {
                    nodeList.offer(tree.rightSubTree);
                    levelList.offer(level);
                }
            }
        }

        while(!levelList.isEmpty()){
            ipl += levelList.poll();
        }

        return ipl;
    }


    public int iPathLength(BinaryTree t, int depth) {
        if (t == null)
            return 0;
        return iPathLength(t.leftSubTree, depth + 1) + iPathLength(t.rightSubTree, depth + 1) + depth;
    }
    public int countNodes(BinaryTree t) {
        if (t == null || t.root == null)
            return 0;

        return countNodes(t.leftSubTree) + countNodes(t.rightSubTree) + 1;
    }
    public BinaryTree clone(BinaryTree t) {
        if (t == null) {
            return null;
        }

        BinaryTree cloneTree = new BinaryTree(t.root.getLabel());
        cloneTree.leftSubTree = clone(t.leftSubTree);
        cloneTree.rightSubTree = clone(t.rightSubTree);
        return cloneTree;
    }

    // exercise 1 method
    public boolean isEqual(BinaryTree t1, BinaryTree t2) {
        if (t1 == null && t2 == null)
            return true;

        else if (t1 == null || t2 == null)
            return false;

        else
            return t1.root.getLabel().equals(t2.root.getLabel()) && isEqual(t1.leftSubTree, t2.leftSubTree)
                    && isEqual(t1.rightSubTree, t2.rightSubTree);
    }

}

package tut10.binary_search_tree;

public class BTSTreeApp {
        public static void main(String[] args) {
            BinarySearchTree t = new BinarySearchTree();
            t.addRoot(7);
            t.insert(5, t);
            t.insert(10, t);
            t.insert(4, t);
            t.insert(20, t);
            t.insert(6, t);
            t.insert(8, t);
            t.preOrderTraversal(t);
            System.out.println();
            System.out.println("The maximum value of all nodes in the tree is: " + t.getMax(t));
            System.out.println("The minimum value of all nodes in the tree is: " + t.getMin(t));
            System.out.println("Searching for key = 4: " + t.search(4, t));
            System.out.println("Searching for key = 10: " + t.search(10, t));
        }

}

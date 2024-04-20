package tut10.binary_tree;

public class BinaryTreeApp {
    public static void main(String[] args) {
        BinaryTree t1 = new BinaryTree();
        BinaryTree t2 = new BinaryTree();
        BinaryTree t3 = new BinaryTree();
        BinaryTree t4 = new BinaryTree();
        BinaryTree t5 = new BinaryTree();
        BinaryTree t6 = new BinaryTree();
        BinaryTree t7 = new BinaryTree();
        BinaryTree t8 = new BinaryTree();
        BinaryTree t9 = new BinaryTree();
        BinaryTree t10 = new BinaryTree();


        t9.buildTree("4",null,null);
        t8.buildTree("9",t9,null);
        t7.buildTree("5",null,t8);
        t6.buildTree("11",null, null);
        t5.buildTree("5",null,null);
        t4.buildTree("6",t5,t6);
        t3.buildTree("2",null,null);

        t2.buildTree("7",t3,t4);

        t1.buildTree("2",t2,t7);


        /**
         *              2(t1)
         *            /    \
         *  1       7(t2)  5(t7)
         *         /  \       \
         *  2   2(t3) 6(t4)   9(t8)
         *           /  \     /
         *  3      5    11   4(t9)
         *        t5)   (t6)
         */


        System.out.println(t1.iPathLength(t1));

        /**
         * 1+2+2+3+3 + 1+2+3 = 17
         */

    }
}

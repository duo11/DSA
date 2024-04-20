package tut9.example2_exercise2;

public class ArrayBinaryTreeApp {
    public static void main(String[] args) {
        ArrayBinaryTree bt = new ArrayBinaryTree();

        bt.addRoot("A");
        bt.addLeftChild("B",0);
        bt.addRightChild("C",0);
        bt.addLeftChild("D",1);
        bt.addLeftChild("G",3);
        bt.addLeftChild("E",2);
        bt.addLeftChild("H",5);
        bt.addRightChild("I",5);
        bt.addRightChild("F",2);
        bt.addRightChild("K",6);

        for(int i = 0; i < bt.maxSize;i++){
            System.out.print(bt.l[i] + " ");
        }
        System.out.println();

        bt.preOrderTravel(0);

        System.out.println();

        System.out.println("C is leaf?: "+bt.isLeaf(2));
        System.out.println("G is leaf?: "+bt.isLeaf(7));
        System.out.println("Level of node F: " + bt.getLevel(5));


        bt.inOrderTravel(0);

        System.out.println();
        bt.postOrderTravel(0);

        bt.search("G");
    }
}

package tut9.example1_exercise1;

public class ArrayTreeApp {
    public static void main(String[] args) {
        ArrayTree t = new ArrayTree();
        t.addNode("A",-1);
        t.addNode("B",0);
        t.addNode("C",1);
        t.addNode("D",0);
        t.addNode("E",2);
        t.addNode("F",1);


        for(int i = 0; i < t.getL().length;i++){
            System.out.print(t.getL()[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < t.getP().length;i++){
            System.out.print(t.getP()[i] + " ");
        }
        System.out.println();

        System.out.println(t.getLevel(4));


    }
}

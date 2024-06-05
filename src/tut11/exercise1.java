package tut11;

import tut11.example2.GALVertex;
import tut11.example2.GraphDFS;
import tut11.example2.SLNode;

public class exercise1 {
    public static void setAlphabetLabel(GraphDFS g){

    }

//    public static void set(GALVertex v, char c){
//        if(v.getLabel() != c){
//            v.setLabel(c);
//            for(int i = 0 ; i < v.getAdjList().getLength();i++){
//                ;
//            }
//            set(v.getAdjList().get(i),c)
//
//        }
//    }



    public static void main(String[] args) {
        GALVertex[] v = new GALVertex[9];
        v[0]=new GALVertex('A');  v[0].addToAdjList(3);
        v[1]=new GALVertex('B');  v[1].addToAdjList(2);
        v[2]=new GALVertex('C');  v[2].addToAdjList(1);
        v[3]=new GALVertex('D');  v[3].addToAdjList(1); v[3].addToAdjList(7); v[3].addToAdjList(6);
        v[4]=new GALVertex('E');  v[4].addToAdjList(5); v[4].addToAdjList(8);
        v[5]=new GALVertex('F');  v[5].addToAdjList(4); v[5].addToAdjList(8);
        v[6]=new GALVertex('G');  v[6].addToAdjList(3);
        v[7]=new GALVertex('G');  v[6].addToAdjList(3);
        v[8]=new GALVertex('G');  v[6].addToAdjList(4); v[4].addToAdjList(5);

        GraphDFS g1 = new GraphDFS();



    }
}

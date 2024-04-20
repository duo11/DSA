/**
 * Write a description of class GraphDFS here.
 * @author (nxthang) 
 * @version (1.0) 
 */
package tut11.example2;
public class GraphDFS
{
    private static int n=7;
    private static GALVertex[] v;                               
    
    /**
     * Constructor for objects of class GraphDFS
     */
    public GraphDFS()
    {
    }

    public GraphDFS (int n, GALVertex[] v){
        this.n = n;
        this.v = v;

    }

    public  int getN() {
        return n;
    }

    public  GALVertex[] getV() {
        return v;
    }

    public static void DFS(int u)
    {
        if( v[u].getColor() == 'b' ){
            v[u].setColor('y');
            System.out.print(v[u].getLabel() + " ");
            for(int i = 0 ; i < v[u].getAdjList().getLength();i++){
                int neightbor = v[u].getAdjList().get(i).getData();
                DFS(neightbor);
            }
        }
    }
    
    public static void DFS_Initialize()
    {
        for(GALVertex v : v) {
            v.setColor('b');
        }
    }
    
    public static void main(String[]args)
    {
        v = new GALVertex[n];     //Create an empty list of n vertices
        // Initialize vertex's label
        v[0]=new GALVertex('A');  v[0].addToAdjList(1); v[0].addToAdjList(4);
        v[1]=new GALVertex('B');  v[1].addToAdjList(0); v[1].addToAdjList(2); v[1].addToAdjList(6);
        v[2]=new GALVertex('C');  v[2].addToAdjList(1); v[2].addToAdjList(5);   
        v[3]=new GALVertex('D');  v[3].addToAdjList(4); v[3].addToAdjList(5);
        v[4]=new GALVertex('E');  v[4].addToAdjList(0); v[4].addToAdjList(3); v[4].addToAdjList(5);
        v[5]=new GALVertex('F');  v[5].addToAdjList(2); v[5].addToAdjList(3); v[5].addToAdjList(4);
        v[6]=new GALVertex('G');  v[6].addToAdjList(1);

        System.out.println("DFS traversal from vertex v[0]");
        DFS_Initialize();
        DFS(0);
        System.out.println("");        
        System.out.println("DFS traversal from vertex v[6]");
        DFS_Initialize();        
        DFS(6);        
    }
}

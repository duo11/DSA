/**
 * Write a description of class GraphBFS here.
 * @author (nxthang) 
 * @version (1.0)
 */
package tut11.example1;
public class GraphBFS
{
    private static int n=7;
    private static int[][] a = {
                                {0,1,0,0,1,0,0},
                                {1,0,1,0,0,0,1},
                                {0,1,0,0,0,1,0},
                                {0,0,0,0,1,1,0},
                                {1,0,0,1,0,1,0},
                                {0,0,1,1,1,0,0},
                                {0,1,0,0,0,0,0}                                
                               };
    private static GVertex[] v;                               
    
    /**
     * Constructor for objects of class GraphBFS
     */
    public GraphBFS()
    {

    }
    public GraphBFS(int n, int[][] matrix,GVertex[] v){
        this.n = n;
        this.a = matrix;
        this.v = v;
    }
    
    public static void BFS(int s)
    {
        for(GVertex v : v){
            v.setColor('b');
        }
        ArrayQueue q = new ArrayQueue();
        v[s].setColor('y');
        q.enqueue(s);
        while(!q.isEmpty()){
            int u = q.dequeue();
            System.out.print(v[u].getLabel()+ " ");
            for(int i = 0 ; i < n;i++){
                if(a[u][i] == 1){
                    if(v[i].getColor() == 'b'){
                        v[i].setColor('y') ;
                        q.enqueue(i);
                    }
                }
            }
        }
        System.out.println();
    }

    
    public static void main(String[]args)
    {
        v = new GVertex[n];     //Create an empty list of n vertices
        // Initialize vertex's label
        v[0]=new GVertex('A');
        v[1]=new GVertex('B');
        v[2]=new GVertex('C');
        v[3]=new GVertex('D');
        v[4]=new GVertex('E');
        v[5]=new GVertex('F');
        v[6]=new GVertex('G');

        System.out.println("BFS traversal from vertex v[0]");
        BFS(0);
        System.out.println("BFS traversal from vertex v[6]");
        BFS(6);






        
    }
}

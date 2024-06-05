
package tut12.exercise1;
public class FindMyCoffee
{
    private static int m=5;
    private static int n=8;
    private static char[][] map={
                            {'G','G','G','G','G','X','G','G'},
                            {'G','G','G','G','G','X','G','G'},
                            {'G','G','G','G','G','X','G','C'},                            
                            {'G','G','X','G','G','G','G','G'},
                            {'Y','G','X','G','G','G','G','G'}
                        };
    private static GVertex startVertex,endVertex;                    
    private static int numOfVertex=0;
    private static GVertex[] listVertex;
    private static GVertex[] path;

    public FindMyCoffee()
    {
    }
    
    private static void constructGraph()
    {	
    	//list of m*n vertices
        listVertex=new GVertex[m*n];
        numOfVertex=0;
        for (int i=0; i<m; i++)
            for (int j=0; j<n; j++)
            {
            	//map[0][0] -> map[4][7]: 40 nodes
            	//create new vertices (associated with their adjacency properties)
                listVertex[numOfVertex]=new GVertex(numOfVertex,map,m,n);
                if (map[i][j]=='Y')//map[4][0]='Y'
                    startVertex=listVertex[numOfVertex];
                if (map[i][j]=='C')//map[2][7]='C'
                    endVertex=listVertex[numOfVertex];               
                numOfVertex++;
            }
    }
    
    private static boolean BFS(GVertex entry, GVertex goal)
    {
        //make all element of path become null
        path = new GVertex[numOfVertex];
        for (int i=0; i<numOfVertex; i++)
            path[i]=null;


        ArrayQueue queue = new ArrayQueue();

        queue.enqueue(entry);
        entry.setMarked(true);
        while (!queue.isEmpty())
        {          
            GVertex currentV = queue.dequeue();

            //return true when find the goal
            if (currentV.getIndex() == goal.getIndex())
            {
                showPath(entry,goal);
                return true;
            }
            int adjs = currentV.getNumOfAdjVertex();
            int[] adjOfCurrentV = currentV.getAdjVertex();
            //Check in order: left -> down -> right -> up
            for (int i = adjs-1; i>=0 ; i--)
            {
                int indexOfAdj = adjOfCurrentV[i];
                GVertex adj = listVertex[indexOfAdj];

                // if adj is marked, move to next adj, if not => set marked, set path and enqueue this adj
                if (adj.getMarked()== false)
                {
                    adj.setMarked(true);
                    path[adj.getIndex()]= currentV;
                    //enqueue the fo
                    queue.enqueue(adj);
                }
            }
        }
        //return false when there is no goal
        return false;
    }
    /*
    1: s = "=> (2,7)"
    2: s = "=> (3,7) => (2,7)"
    ................
    n: s = "(4,0) => (4,1) => .... => (3,7) => (2,7)"
     */

    private static void showPath(GVertex src, GVertex des)
    {
        String s = new String();
        while(des != src){
            s = " => (" + des.getRow() + "," + des.getColumn() + ")" + s;
            des = path[des.getIndex()];
        }
        s = "(" + des.getRow() + "," + des.getColumn() + ")" + s;
        System.out.println(s);

    }
    
    public static void main(String[]args)
    {
        constructGraph();
        BFS(startVertex,endVertex);
    }
}

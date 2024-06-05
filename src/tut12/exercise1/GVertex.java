
package tut12.exercise1;
public class GVertex
{
    private int index;
    private int row;
    private int column;
    private boolean marked;
    private int numOfAdjVertex;
    private int[] adjVertex;

    public GVertex(int index, char[][] map, int m, int n)
    {
        this.index=index;
        row=index / n;
        column=index % n;
        marked=false;
        numOfAdjVertex=0;
        adjVertex = new int[4];
        //check availability of the above vertex
        if (row>0)  {     
            if (map[row-1][column] != 'X') {
                adjVertex[numOfAdjVertex]=(row-1)*n + column;
               
                numOfAdjVertex++;
            }
        }
        //check availability of the right vertex
        if (column<n-1) {
            if (map[row][column+1] != 'X') {
                adjVertex[numOfAdjVertex]=row*n+column+1;
                numOfAdjVertex++;
            }    
        }
        //check availability of the below vertex
        if (row<m-1) {
            if (map[row+1][column] != 'X') {
                adjVertex[numOfAdjVertex]=(row+1)*n + column;
                numOfAdjVertex++;
            }
        }
        //check availability of the left vertex
        if (column>0) {
            if (map[row][column-1] != 'X') {
                adjVertex[numOfAdjVertex]=row*n+column-1;
                numOfAdjVertex++;
            }
        }
    }
    
    public int getIndex()
    {
        return index;
    }
    
    public int getRow()
    {
        return row;
    }
    
    public int getColumn()
    {
        return column;
    }
    
    public boolean getMarked()
    {
        return marked;
    }
    
    public void setMarked(boolean marked)
    {
        this.marked=marked;
    }
    
    public int getNumOfAdjVertex()
    {
        return numOfAdjVertex;
    }
    
    public int[] getAdjVertex()
    {
        return adjVertex;
    }
    
    public String toString()
    {
        String s = String.format("Vertex: %d Row: %d Column: %d Marked: %b numOfAdjVertex: %d%n {",index,row,column,marked,numOfAdjVertex);
        for (int i=0; i<numOfAdjVertex; i++)  {
            String s1 = String.format("%d ",adjVertex[i]);
            s+=s1;
        }
        return s+"}";
    }
}

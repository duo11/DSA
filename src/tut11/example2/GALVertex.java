package tut11.example2;

public class GALVertex {
    private char label;
    private char color;
    private SLList adjList;

    /**
     * Constructor for objects of class GVertex
     */
    public GALVertex(char label) {
        this.label = label;
        this.color = 'w'; // Default color is white, assuming 'w' represents white.
        adjList = new SLList(); // Initialize the adjacency list.
    }

    public char getLabel() {
        return label;
    }

    public void setLabel(char label) {
        this.label = label;
    }

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }

    public void addToAdjList(int vertex) {
        adjList.add(new SLNode(vertex)); // Add the vertex to the adjacency list.
    }

    public SLList getAdjList() {
        return adjList;
    }
}

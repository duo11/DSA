package tut11.example2;

public class SLNode {
    private int data;
    private SLNode next;

    /**
     * Constructor for objects of class SLNode
     * This constructor create a node from an input string (data)
     */
    public SLNode(int data) {
        this.data = data;
        this.next = null; // Initialize next to null as this node is not yet linked to any other node.
    }

    /**
     * This operation sets the next reference to the node specified in the parameter (next)
     */
    public void setNext(SLNode next) {
        this.next = next;
    }

    /**
     * This operation return the next reference
     */
    public SLNode getNext() {
        return next;
    }

    /**
     * This operation assigns data of the node to the input string (data)
     */
    public void setData(int data) {
        this.data = data;
    }

    /**
     * This operation return the current data of the node
     */
    public int getData() {
        return data;
    }
}

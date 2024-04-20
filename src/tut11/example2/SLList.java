package tut11.example2;

public class SLList {
    private SLNode head;

    /**
     * Constructor for objects of class SLList.
     * This constructor will create an empty list.
     */
    public SLList() {
        head = null; // Initialize head to null, indicating an empty list.
    }

    /**
     * This operation returns true if the list is empty, otherwise it returns false
     */
    public boolean isEmpty() {
        return head == null; // If head is null, the list is empty.
    }

    /**
     * This is a private operation (supplementary operation). It returns the node at the pos position of the list.
     */
    private SLNode traversing(int pos) {
        SLNode current = head;
        for (int i = 0; i < pos && current != null; i++) {
            current = current.getNext(); // Traverse through the list until reaching the desired position.
        }
        return current;
    }

    /**
     * This operation adds a newNode into the beginning of the list
     */
    public void add(SLNode newNode) {
        newNode.setNext(head); // Set the next of newNode to the current head.
        head = newNode; // Update head to newNode.
    }

    /**
     * This operation returns the node at the pos position of the list.
     */
    public SLNode get(int pos) {
        return traversing(pos); // Simply call the traversing method to get the node at the specified position.
    }

    /**
     * This operation returns the current length of the list.
     */
    public int getLength() {
        int length = 0;
        SLNode current = head;
        while (current != null) {
            length++; // Increment length while traversing through the list.
            current = current.getNext();
        }
        return length;
    }
}

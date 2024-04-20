package tut11.example1;

public class ArrayQueue {
    private int[] items;
    private static final int maxSize = 10000;
    private int front;
    private int rear;

    /**
     * Constructor for objects of class ArrayQueue. This constructor creates an empty queue.
     */
    public ArrayQueue() {
        items = new int[maxSize];
        front = 0;
        rear = -1; // Initially, the rear is set to -1 as the queue is empty.
    }

    /**
     * This operation returns true if the queue is empty, otherwise it returns false
     */
    public boolean isEmpty() {
        return (rear < front);
    }

    /**
     * This operation returns true if the queue is full, otherwise it returns false
     */
    public boolean isFull() {
        return (rear == maxSize - 1);
    }

    /**
     * This operation adds a newItem to the queue.
     */
    public void enqueue(int newItem) {
        if (!isFull()) {
            items[++rear] = newItem; // Increment rear and then insert newItem at the rear position.
        } else {
            System.out.println("Queue is full. Cannot enqueue item.");
        }
    }

    /**
     * This operation returns the item at the front position of the queue and deletes this item.
     */
    public int dequeue() {
        if (!isEmpty()) {
            return items[front++]; // Increment front and return the item at the front.
        } else {
            System.out.println("Queue is empty. Cannot dequeue item.");
            return -1; // Returning -1 as an indication of an empty queue.
        }
    }

    /**
     * This operation returns an item at the front position of the queue. This item will not be deleted.
     */
    public int peek() {
        if (!isEmpty()) {
            return items[front]; // Just return the item at the front without deleting it.
        } else {
            System.out.println("Queue is empty. Cannot peek item.");
            return -1; // Returning -1 as an indication of an empty queue.
        }
    }

    public static void main(String[] args) {
        System.out.println("TrollDA");

    }
}

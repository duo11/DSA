package tut7;

public class ArrayQueue {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int size;

    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        this.queueArray = new int[maxSize];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == maxSize;
    }

    public void enqueue(int newItem) {
        if (!isFull()) {
            rear = (rear + 1) % maxSize;
            queueArray[rear] = newItem;
            size++;
        } else {
            System.out.println("Queue is full. Cannot enqueue item.");
        }
    }

    public int dequeue() {
        if (!isEmpty()) {
            int dequeuedItem = queueArray[front];
            front = (front + 1) % maxSize;
            size--;
            return dequeuedItem;
        } else {
            System.out.println("Queue is empty. Cannot dequeue item.");
            return -1; // Return a default value indicating an error
        }
    }

    public int peek() {
        if (!isEmpty()) {
            return queueArray[front];
        } else {
            System.out.println("Queue is empty. Cannot peek.");
            return -1; // Return a default value indicating an error
        }
    }

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);
        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(3);
        queue.enqueue(8);

        System.out.println("Queue contents:");
        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }

        System.out.println("Is queue empty? " + queue.isEmpty()); // Output: true
    }
}
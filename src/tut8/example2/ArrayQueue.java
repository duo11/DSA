package tut8.example2;

public class ArrayQueue {
    private char[] queue;
    private int front, rear, size;

    public ArrayQueue(int capacity) {
        this.queue = new char[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public void enqueue(char data) {
        if (size == queue.length) {
            throw new IllegalStateException("Queue is full");
        }

        rear = (rear + 1) % queue.length;
        queue[rear] = data;
        ++size;
    }

    public char dequeue() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }

        char data = queue[front];
        front = (front + 1) % queue.length;
        --size;
        return data;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
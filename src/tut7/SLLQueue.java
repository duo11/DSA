package tut7;

class SLLQueue {
    Node front;
    private Node rear;

    public SLLQueue() {
        this.front = null;
        this.rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(int newItem) {
        Node newNode = new Node(newItem);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        int temp = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return temp;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot peek.");
            return -1;
        }
        return front.data;
    }

    public int findMax() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot find maximum.");
            return -1;
        }
        int max = front.data;
        Node current = front.next;
        while (current != null) {
            if (current.data > max) {
                max = current.data;
            }
            current = current.next;
        }
        return max;
    }

    public int findMin() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot find minimum.");
            return -1;
        }
        int min = front.data;
        Node current = front.next;
        while (current != null) {
            if (current.data < min) {
                min = current.data;
            }
            current = current.next;
        }
        return min;
    }
}

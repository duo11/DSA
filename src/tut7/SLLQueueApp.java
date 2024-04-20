package tut7;

class SLLQueueApp {
    public static void printQueue(SLLQueue q) {
        Node current = q.front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SLLQueue queue = new SLLQueue();
        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(3);
        queue.enqueue(8);

        System.out.println("Queue contents:");
        printQueue(queue); // Output: 5 10 3 8

        System.out.println("Dequeue: " + queue.dequeue()); // Output: 5
        System.out.println("Peek: " + queue.peek()); // Output: 10

        System.out.println("Max: " + queue.findMax()); // Output: 10
        System.out.println("Min: " + queue.findMin()); // Output: 3
    }
}
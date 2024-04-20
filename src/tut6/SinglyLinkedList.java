package tut6;
public class SinglyLinkedList {
    private SLNode head;
    private int size;

    public SinglyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void add(SLNode n) {
        if (head == null) {
            head = n;
        } else {
            n.setNext(head);
            head = n;
        }
        size++;
    }

    public void remove(int pos) {
        if (pos < 0 || pos >= size)
            throw new IndexOutOfBoundsException("Invalid position");

        if (pos == 0) {
            head = head.getNext();
        } else {
            SLNode current = head;
            for (int i = 0; i < pos - 1; i++) {
                current = current.getNext();
            }
            current.setNext(current.getNext().getNext());
        }
        size--;
    }

    public void addAt(int pos, SLNode n) {
        if (pos < 0 || pos > size)
            throw new IndexOutOfBoundsException("Invalid position");

        if (pos == 0) {
            add(n);
        } else {
            SLNode current = head;
            for (int i = 0; i < pos - 1; i++) {
                current = current.getNext();
            }
            n.setNext(current.getNext());
            current.setNext(n);
            size++;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void print() {
        SLNode current = head;
        while (current != null) {
            current.print();
            current = current.getNext();
        }
    }

    public int search(String data) {
        SLNode current = head;
        int pos = 0;
        while (current != null) {
            if (current.getData().equals(data)) {
                return pos;
            }
            current = current.getNext();
            pos++;
        }
        return -1;
    }

}
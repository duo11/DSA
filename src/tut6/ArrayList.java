package tut6;

public class ArrayList {
    private int[] array;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    // Constructor
    public ArrayList() {
        array = new int[DEFAULT_CAPACITY];
        size = 0;
    }

    // Method to add an element to the end of the list
    public void add(int data) {
        ensureCapacity();
        array[size++] = data;
    }

    // Method to remove an element from a specific position
    public int remove(int pos) {
        if (pos < 0 || pos >= size)
            throw new IndexOutOfBoundsException("Invalid position");

        int removedElement = array[pos];
        for (int i = pos; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return removedElement;
    }

    // Method to add an element at a specific position
    public void add(int pos, int data) {
        if (pos < 0 || pos > size)
            throw new IndexOutOfBoundsException("Invalid position");

        ensureCapacity();
        for (int i = size; i > pos; i--) {
            array[i] = array[i - 1];
        }
        array[pos] = data;
        size++;
    }

    // Method to check if the list is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Method to check if the list is full (assuming it's backed by an array with fixed capacity)
    public boolean isFull() {
        return size == array.length;
    }

    // Method to get the size of the list
    public int size() {
        return size;
    }

    // Method to print the element at a specific position
    public void get(int pos) {
        if (pos < 0 || pos >= size)
            throw new IndexOutOfBoundsException("Invalid position");

        System.out.println(array[pos]);
    }

    // Method to print all elements in the list
    public void printAll() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Private method to ensure the capacity of the underlying array
    private void ensureCapacity() {
        if (size == array.length) {
            int[] newArray = new int[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
    }
}

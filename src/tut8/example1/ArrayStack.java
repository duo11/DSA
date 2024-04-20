package tut8.example1;

public class ArrayStack {
    private int top;
    private int[] stackArray;

    public ArrayStack(int capacity) {
        this.top = -1;
        this.stackArray = new int[capacity];
    }

    public void push(int value) {
        top++;
        stackArray[top] = value;
    }

    public int pop() {
        return stackArray[top--];
    }
}
package tut7;
class ArrayStack {
    int maxSize;
    private String[] stackArray;
    private int top;

    public ArrayStack(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new String[maxSize];
        this.top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public void push(String newItem) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push item.");
            return;
        }
        top++;
        stackArray[top] = newItem;
    }

    public String pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop item.");
            return null;
        }
        String popped = stackArray[top];
        top--;
        return popped;
    }

    public String peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return null;
        }
        return stackArray[top];
    }
}


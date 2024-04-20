package tut7;

class ArrayStackApp {
    public static void copyStack(ArrayStack src, ArrayStack des) {
        ArrayStack tempStack = new ArrayStack(src.maxSize);
        while (!src.isEmpty()) {
            tempStack.push(src.pop());
        }
        while (!tempStack.isEmpty()) {
            String item = tempStack.pop();
            src.push(item);
            des.push(item);
        }
    }

    public static void printStack(ArrayStack s) {
        ArrayStack tempStack = new ArrayStack(s.maxSize);
        while (!s.isEmpty()) {
            String item = s.pop();
            System.out.print(item + " ");
            tempStack.push(item);
        }
        while (!tempStack.isEmpty()) {
            s.push(tempStack.pop());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);
        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println("Peek: " + stack.peek()); // Output: C

        System.out.println("Pop: " + stack.pop()); // Output: C
        System.out.println("Pop: " + stack.pop()); // Output: B

        System.out.println("Peek after pops: " + stack.peek()); // Output: A

        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: false

        System.out.println("Pop: " + stack.pop()); // Output: A
        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: true

        // Demonstrating utility methods
        ArrayStack src = new ArrayStack(5);
        src.push("X");
        src.push("Y");
        src.push("Z");

        ArrayStack des = new ArrayStack(5);
        copyStack(src, des);

        System.out.println("Contents of source stack:");
        printStack(src);

        System.out.println("Contents of destination stack:");
        printStack(des);
    }
}
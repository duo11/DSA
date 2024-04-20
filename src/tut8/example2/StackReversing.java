package tut8.example2;

public class StackReversing {


    public static SLLStack reversing(SLLStack stack){
        ArrayQueue queue = new ArrayQueue(50);

        while(!stack.isEmpty()){
            queue.enqueue(stack.pop());
        }
        while(!queue.isEmpty()){
            stack.push(queue.dequeue());
        }
        return stack;

    }
    public static void main(String[] args) {
        SLLStack stack = new SLLStack();
        stack.push('a');
        stack.push('b');
        stack.push('c');
        stack.push('d');
        System.out.println("Stack: " + stack);

        System.out.println("Stack after reversing: " + reversing(stack));

    }
}
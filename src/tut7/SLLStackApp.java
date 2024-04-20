package tut7;

public class SLLStackApp {

    public static void printStack (SLLStack stack) {
        if(!stack.isEmpty()){
            StackNode node = stack.pop();
            printStack(stack);
            System.out.print(node.data + " ");
            stack.push(node);

        }
    }


    public static void main(String[] args) {

        SLLStack stack = new SLLStack();
        stack.push(new StackNode('A'));
        printStack(stack);
        System.out.println();

        stack.push(new StackNode('B'));
        printStack(stack);
        System.out.println();

        stack.push(new StackNode('C'));

        System.out.println(stack.peak().data);

//        System.out.println(stack.pop().data);
//        System.out.println(stack.peak());

        printStack(stack);
        System.out.println();
        stack.push(new StackNode('D'));
        printStack(stack);

    }
}

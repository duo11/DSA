package tut7;

public class SLLStack {
    private StackNode head;

    private final int MAXSIZE = 100;

    int top ;
    public SLLStack () {
        head = null;
        top = 0;
    }
    public boolean isEmpty () {
        return top == 0;
    }
    public boolean isFull () {
        return top == MAXSIZE;
    }
    public void push(StackNode newNode) {
        if(!isFull()) {
            newNode.setNext(head);
            head = newNode;
            top++;
        }
        else{
            System.out.println("The stack is full");
        }
    }
    public StackNode pop () {
        if(!isEmpty()) {
            StackNode tmp = head;
            head = head.getNext();
            top--;
            return tmp;
        }
        else{
            System.out.println("the stack is empty");;
            return null;
        }
    }
    public StackNode peak () {
        if(!isEmpty()) {
            return head;
        }
        else{
            return  null;
        }
    }


}

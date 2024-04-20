package tut7;

import java.util.Stack;

public class StackNode {
    char data;
    StackNode next;

    public StackNode(char a) {
        data = a;
        next = null;
    }

    public void setData(char data) {
        this.data = data;
    }
    public char getData () {
        return data;
    }
    public void setNext(StackNode node) {
        next = node;
    }
    public StackNode getNext() {
        return next;
    }
}

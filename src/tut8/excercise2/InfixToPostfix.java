package tut8.excercise2;

import java.util.*;

public class InfixToPostfix {
    public static String converter(String string) {
        StringBuilder s = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        stack.add('#');

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                s.append(c);
            }
            else{
                if(pre(c) > stack.peek()){
                    stack.push(c);
                }
                else{
                    s.append(stack.pop());
                    stack.push(c);
                }
            }
        }
        // pop all the operators
        while (!stack.isEmpty()) {
            s.append(stack.pop());
        }

        return s.toString();
    }

    private static int pre(char c) {
        switch (c) {
            case '+','-':
                return 2;
            case '*','/':
                return 3;
            case '(',')':
                return 1;
            default:
                return 0;
        }
    }

}
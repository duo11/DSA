package tut10.expression_tree;

import java.util.Scanner;
import java.util.Stack;

public class ETApp {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the infix: ");
        String infix = inp.nextLine();

        String postfix= infixToPostfix(infix);

        System.out.println("Postfix: " + postfix);

        ExpressionTree expressionTree = new ExpressionTree();
        expressionTree.buildTree(postfix);

        System.out.println("Result: " + expressionTree.evaluate());

        inp.close();
    }

    private static String infixToPostfix(String infix) {
        StringBuilder res = new StringBuilder();
        Stack<Character> S = new Stack<>();

        for (int i = 0; i < infix.length(); i++) {
            char c = infix.charAt(i);

            // add in output if is operand
            if (Character.isLetterOrDigit(c)) {
                res.append(c);
            }

            // push in stack if '('
            else if (c == '(') {
                S.push(c);
            }

            // pop output from stack if ')'
            // util see '('
            else if (c == ')') {
                while (!S.isEmpty() && S.peek() != '(') {
                    res.append(S.pop());
                }

                if (!S.isEmpty() && S.peek() != '(')
                    return "Invalid Expression";
                else
                    S.pop(); // pop '('
            }

            else {
                // compare precedence operand to operand on top in stack
                while (!S.isEmpty() && pre(c) <= pre(S.peek())) {
                    res.append(S.pop());
                }

                S.push(c);
            }
        }
        // pop all the operators
        while (!S.isEmpty()) {
            res.append(S.pop());
        }

        return res.toString();
    }

    private static int pre(char c) {
        switch (c) {
            case '+':
            case '-':
                return 2;
            case '*':
            case '/':
                return 3;
            case '^':
                return 4;
            default:
                return 1;
        }
    }
}

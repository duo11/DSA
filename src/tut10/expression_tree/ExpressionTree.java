package tut10.expression_tree;

import java.util.Stack;

public class ExpressionTree {
    ETNode root;

    public ExpressionTree() {
        this.root = null;
    }

    public void buildTree(String postfix) {
        Stack<ETNode> s = new Stack<>();

        for (int i = 0; i < postfix.length(); i++) {
            char c = postfix.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                s.push(new ETNode(Character.toString(c)));
            }

            else {
                ETNode r = s.pop();
                ETNode l = s.pop();

                ETNode newNode = new ETNode(Character.toString(c));
                newNode.setLeft(l);
                newNode.setRight(r);

                s.push(newNode);
            }
        }

        root = s.pop();
    }

    public int evaluate() {
        return evaluate(root);
    }

    private int evaluate(ETNode node) {
        if (Character.isDigit(node.getData().charAt(0))) {
            return Integer.parseInt(node.getData());
        }

        int l = evaluate(node.getLeft());
        int r = evaluate(node.getRight());

        switch (node.getData()) {
            case "+":
                return l + r;
            case "-":
                return l - r;
            case "*":
                return l * r;
            case "/":
                return l / r;
            case "^":
                return (int) Math.pow(l, r);
            default:
                throw new IllegalArgumentException("Invalid operator: " + node.getData());
        }
    }
}

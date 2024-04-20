package tut8.example1;

public class PostfixEvaluation {
    public static int evaluatePostfix(String s) {
        ArrayStack stack = new ArrayStack(s.length());

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                stack.push(c - '0');
            }
            else {
                int o1 = stack.pop();
                int o2 = stack.pop();

                switch (c) {
                    case '+':
                        stack.push(o2 + o1);
                        break;
                    case '-':
                        stack.push(o2 - o1);
                        break;
                    case '*':
                        stack.push(o2 * o1);
                        break;
                    case '/':
                        stack.push(o2 / o1);
                        break;
                }
            }
        }
        return stack.pop();
    }
}
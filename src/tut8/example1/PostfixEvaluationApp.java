package tut8.example1;

import static tut8.example1.PostfixEvaluation.evaluatePostfix;

public class PostfixEvaluationApp {
    public static void main(String[] args) {
        String test = "85*334+*-"; // 8*5-3*(3+4) = 19
        System.out.println("Postfix valuate " + test + " is " + evaluatePostfix(test));
    }
}

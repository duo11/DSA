package tut8.excercise2;

import static tut8.excercise2.InfixToPostfix.converter;

public class InfixToPostfixApp {
    public static void main(String[] args) {
        String string = "(1+3)*((2-4)*5+7)";
        System.out.println("Infix: " + string);
        System.out.println("Postfix: " + converter(string));
    }
}

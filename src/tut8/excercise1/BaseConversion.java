package tut8.excercise1;

import java.util.*;

public class BaseConversion {

    public static String convertToBase(int num, int base) {
        ArrayStack stack = new ArrayStack(100);
        StringBuilder s = new StringBuilder();

        while (num > 0) {
            stack.push(num % base);
            num /= base;
        }

        while (!stack.isEmpty()) {
            int digit = stack.pop();
            if (digit < 10) {
                s.append(digit);
            } else {
                // append A-Z for 10-35
                s.append((char) ('A' + digit - 10));
            }

        }

        return s.toString();
    }

}
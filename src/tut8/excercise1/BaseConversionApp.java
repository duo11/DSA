package tut8.excercise1;

import static tut8.excercise1.BaseConversion.convertToBase;

public class BaseConversionApp {
    public static void main(String[] args) {
        int k = 259;
        int b = 5;
        System.out.println( k + " in base "+ b +" : " +  convertToBase(k, b));
    }
}

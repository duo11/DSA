package Lec1;
import java.util.Scanner;

public class ex1 {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);


            System.out.print("Enter the first floating-point number: ");
            double number1 = scanner.nextDouble();


            System.out.print("Enter the second floating-point number: ");
            double number2 = scanner.nextDouble();


            scanner.close();


            double roundedNumber1 = roundToThreeDecimalPlaces(number1);
            double roundedNumber2 = roundToThreeDecimalPlaces(number2);


            System.out.println("Rounded number 1: " + roundedNumber1);
            System.out.println("Rounded number 2: " + roundedNumber2);


            if (roundedNumber1 == roundedNumber2) {
                System.out.println("The rounded numbers are the same.");
            } else {
                System.out.println("The rounded numbers are different.");
            }
        }
        private static double roundToThreeDecimalPlaces(double number) {
            return Math.round(number * 1000.0) / 1000.0;
        }

}

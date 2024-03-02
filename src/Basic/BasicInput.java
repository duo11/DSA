package Basic;
import java.util.Scanner;
public class BasicInput {
    public static String inputSting (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String s = sc.nextLine();

        return s;
    }
    public static int[] inputIntArray (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Length of the array:");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("PLease enter "+ n + " number:");
        for(int i = 0;i < n;i++){
            array[i] = sc.nextInt();
        }


        return array;
    }
    public static Double[] inputDoubleArray (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Length of the array:");
        int n = sc.nextInt();
        Double[] array = new Double[n];
        System.out.println("PLease enter "+ n + " number:");
        for(int i = 0;i < n;i++){
            array[i] = sc.nextDouble();
        }

        return array;
    }

    public static String[] inputStringArray () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Length of the array:");
        int n = sc.nextInt();
        System.out.println("Please enter " + n + " string:");
        String[] strings = new String[n];
        for(int i = 0; i < n ; i++) {
            strings[i] = sc.next();
        }
        return strings;
    }

}

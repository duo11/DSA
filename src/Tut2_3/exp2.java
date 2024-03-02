package Tut2_3;
import java.util.Random;

public class exp2 {
    public static int SimplePolyEvaluate (int[] arr, int x) {

        int s = 0;
        for(int i = 0; i < arr.length; i++) {
            int p = 1;
            if ( i != 0 ) {
                for ( int j = 1; j <= i ; j++) {
                    p *= x;
                }
            }
            s += arr[i] * p ;
        }
        return s;
    }
    public static int FasterPolynomialSum(int[] arr, int x) {
        int sum = 0;
        int powerOfX = 1;
        for (int element : arr) {
            sum += element * powerOfX;
            powerOfX *= x;
        }

        return sum;
    }

    public static void main(String[] args) {
        Random rd = new Random();
        int[] arr = new int[100000];

        for(int i = 0 ; i < arr.length;i++){
            arr[i] = rd.nextInt(100000);
        }


        long start = System.currentTimeMillis();
        System.out.println(SimplePolyEvaluate(arr, 2));
        long end = System.currentTimeMillis();
        long time = end - start ;
        System.out.println("Time simple polySumCal: " + time);

        long start1 = System.currentTimeMillis();
        System.out.println(FasterPolynomialSum(arr, 2));
        long end1 = System.currentTimeMillis();
        long time1 = end1 - start1 ;
        System.out.print("Time faster polySumCal: " + time1);




    }
}

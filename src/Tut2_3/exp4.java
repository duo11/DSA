package Tut2_3;

public class exp4 {

    public static int gcd (int a, int b) {
        int n = a;
        for(int i = a; i > 0; i--){
            if(a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return -1;
    }
    public static int euclideanGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }



    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(gcd(10,20));
        long end = System.currentTimeMillis();
        long time = end - start ;
        System.out.println("Time simple gcdCal: " + time);

        long start1 = System.currentTimeMillis();
        System.out.println(euclideanGCD(10,20));
        long end1 = System.currentTimeMillis();
        long time1 = end1 - start1 ;
        System.out.print("Time euclideanGCD: " + time1);
    }
}

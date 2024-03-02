package Tut2_3;

public class exp3 {

    public static long power (int a, int n) {
        long s = 1;
        if ( n == 0){
            return 1;
        }
        else{
            for(int i = 0; i < n ;i++) {
                s *= a;
            }
        }
        return s;
    }

    public static long fasterPower(int a, int n) { // exponentiation by squaring
        if (n == 0) {
            return 1;
        }
        long result = 1;
        long base = a;

        while (n > 0) {
            if (n % 2 == 1) {
                result *= base;
            }

            base *= base;
            n /= 2;
        }

        return result;
    }
    static long exponentiation(long base, long exp)
    {
        if (exp == 0)
            return 1;

        if (exp == 1)
            return base ;

        long t = exponentiation(base, exp / 2);
        t = (t * t);

        // if exponent is even value
        if (exp % 2 == 0)
            return t;

            // if exponent is odd value
        else
            return base  * t;
    }

    public static void main(String[] args) {

//        long start = System.currentTimeMillis();
//        System.out.println(power(8,7));
//        long end = System.currentTimeMillis();
//        long time = end - start ;
//        System.out.println("Time simple powerCal: " + time);
//
//        long start1 = System.currentTimeMillis();
//        System.out.println(fasterPower(10,20));
//        long end1 = System.currentTimeMillis();
//        long time1 = end1 - start1 ;
//        System.out.println("Time faster powerCal: " + time1);


        long start2 = System.currentTimeMillis();
        System.out.println(fasterPower(8,6));
        long end2 = System.currentTimeMillis();
        long time2 = end2 - start2 ;
        System.out.print("Time faster powerCal: " + time2);


    }
}

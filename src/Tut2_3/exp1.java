package Tut2_3;

import java.util.Random;


public class exp1 {


//    [1,3,5,6,8,12,33] target : 12
    // space: 1->33 mid = (0+6)/2 = 3 ->   arr[3] < 12
    // -> space: 8->33 arr[5] == 12
    // -> return 5;

    public static int binarySearch (int a ,int start, int end , int[] arr) {

        if(start > end){
            return -1;
        }

        int middle =  (start+ end) / 2;
        if( arr[middle] == a){
            return middle;
        }
        else if( arr[middle] < a){
            return binarySearch(a,middle+1,end,arr);
        }
        else if( arr[middle] > a){
            return binarySearch(a,start,middle-1,arr);
        }

        return middle;

    }

    public static int simpleSearch (int a , int[] arr) {
        for(int i = 0; i < arr.length;i++){
            if(arr[i] == a){
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        Random rd = new Random();

        int[] arr = new int[1000000000];
        for(int i = 0; i < arr.length; i++){
            arr[i] = i;
        }
//        int target = rd.nextInt(1000000000);
        int target = 1000000000-1;
        System.out.println("Target: "+target);

        long start = System.currentTimeMillis();
        System.out.println(binarySearch(target,0 , arr.length -1  ,arr));
        long end = System.currentTimeMillis();
        long time = end - start ;
        System.out.println("Time binary search: " + time);

        long start1 = System.currentTimeMillis();
        System.out.println(simpleSearch(target,arr));
        long end1 = System.currentTimeMillis();
        long time1 = end1 - start1 ;
        System.out.print("Time simple search: " + time1);




//        []
    }
}

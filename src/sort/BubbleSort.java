package sort;
import Basic.BasicPrint;

import java.util.Random;
public class BubbleSort {

    static int[] bubbleSort ( int [] arr) {

        for(int i = 0 ; i < arr.length -1  ; i++) {

            for ( int j = 0 ; j < arr.length -1 ; j++) {

                if( arr[j] > arr[j+1] ) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }

        }

        return arr;

    }

    public static void main(String[] args) {
        Random rd = new Random();

        int[] arr = new int[30];

        for(int i = 0; i < arr.length;i++){
            arr[i] = rd.nextInt(100);
        }

        for(int i = 0; i < arr.length;i++){
            System.out.print(arr[i] + " " );
        }
        System.out.println();
        BasicPrint.printArray(bubbleSort(arr));
    }
}

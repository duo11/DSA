package sort;
import java.util.Random;

public class SelectionSort {

    static int[] selectionSort(int[] arr) {
        for ( int i = 0 ; i < arr.length ; i++ ) {

            int min = arr[i];
            int minIndex = i;

            for(int j = i + 1 ; j < arr.length ; j++ ) {

                if ( arr[j]  < min ) {
                    min = arr[j];
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;


        }
        return arr;
    }

    public static void main(String[] args) {
        Random rd = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length;i++ ){
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i]  + " ");
        }
        System.out.println();
        int[] arrAfter = selectionSort(arr);
        for (int i = 0; i < arr.length;i++ ){
            System.out.print(arrAfter[i] + " ");
        }


    }
}

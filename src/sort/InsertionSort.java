package sort;
import Basic.BasicPrint;
import java.util.Random;
public class InsertionSort {
    static int[] insertionSort (int[] array){

        for (int i = 1 ; i < array.length;i++) {

            int key = array[i];
            int j = i - 1;

            while( j >= 0 && key < array[j]){
                array[j+1] = array[j];
                j--;
            }

            array[j+1] = key ;

        }
        return array;
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
        BasicPrint.printArray(insertionSort(arr));
    }
}

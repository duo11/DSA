package Tut1;
import Basic.BasicInput;
public class ex3 {
    public static void main(String[] args) {

        int[] array = sort(BasicInput.inputIntArray());
        for(int i = 0;i < array.length;i++ ){
            System.out.print(array[i] + " ");
        }
    }
    static int[] sort (int[] array){


        for(int i = 0;i < array.length-1;i++){

            int current = i;
            int currentMin = array[i];

            for(int j = i+1;j < array.length;j++) {
                if (array[j] < currentMin) {
                    currentMin = array[j];
                    current = j;
                }
            }

            int temp = array[i];
            array[i] = array[current];
            array[current] = temp;

            for(int k = 0;k < array.length;k++ ){
                System.out.print(array[k] + " ");
            }

            System.out.println();

        }

        return array;
    }

}

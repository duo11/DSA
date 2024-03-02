package Tut1;
import Basic.BasicInput;
public class ex2 {

    static int max (int[] array){

        int max = 0;


        for (int i = 0;i < array.length;i++){
            if(array[i] > max){
                max = array[i];
            }
        }

        return max;
    }
    public static void main(String[] args) {

        System.out.println("****** Max value finder ******");

        System.out.println(max(BasicInput.inputIntArray()));
    }
}

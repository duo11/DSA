package Lec1;
import java.util.Random;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int[] array = new int[sc.nextInt()];

        for (int i = 0;i < array.length;i++){
            array[i] = random.nextInt();
        }

        for(int i = 0; i < array.length;i++){
            System.out.print(array[i] + " ");
        }
    }
}

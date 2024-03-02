package Lec1;
import java.util.Random;

public class ex3 {

    static int maxSub (int [] array){

        int maxSub = 0;
        for(int i = 0;i < array.length;i++){
            for (int j = i;j < array.length;j++){
                int thisSub = 0;
                for(int k = i; k <= j ; k++){
                    thisSub += array[k];
                }

                if(thisSub > maxSub){
                    maxSub = thisSub;
                }
            }




        }

        return maxSub;
    }

    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[1000];

        for(int i = 0;i < array.length;i++){
            array[i] = random.nextInt(1000)-500;
        }
        long startTime = System.currentTimeMillis();
        System.out.println(maxSub(array));
        long endTime = System.currentTimeMillis();
        long elapeTime = endTime - startTime;
        System.out.println(elapeTime);

    }


}

package tut4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class act2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student numbers: ");
        int n = sc.nextInt();
        String[] names = new String[n];
        int[] scores = new int[n];
        for(int i = 0;i < n;i++) {
            System.out.print("Enter student name " + (i+1) +" : ");
            names[i] = sc.next();

            System.out.print("Enter student score " + (i+1) +" : ");
            scores[i] = sc.nextInt();
        }

        int[] scoresSorted = sort(scores);

        ArrayList<Integer> pos = new ArrayList<>();
        System.out.println("m");
        int m = sc.nextInt();
        for(int i = 0; i < m;i++) {
            for(int j = 0; j < n;j++){
                if(scoresSorted[i] == scores[j] ) {
                    for(int k = 0 ; k < pos.size();k++) {
                        if(!(pos.get(k) == j)){
                            pos.add(j);

                        }

                    }
                }

            }


        }
        for(int j = 0 ; j < pos.size();j++) {
            System.out.println((j+1) +" " +names[pos.get(j)] +  " " + scores[pos.get(j)]);
        }




    }

    public static int[] sort (int[] scores) {

        for ( int i = 0 ; i <scores.length ; i++ ) {

            int max =scores[i];
            int maxIndex = i;

            for(int j = i ; j <scores.length ; j++ ) {

                if (scores[j]  > max ) {
                    max =scores[j];
                    maxIndex = j;
                }
            }

            int temp =scores[i];
            scores[i] =scores[maxIndex];
            scores[maxIndex] = temp;

        }



        return scores;
    }
}

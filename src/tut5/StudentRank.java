package tut5;
import java.util.Scanner;
public class StudentRank {

    //Print Scores string
    public static void print(int[] a,int n) {
        for(int i = 0 ; i < n ; i++) {
            System.out.print(a[i] + " ");
        }
    }

    //Print students string
    public static void print(String[] s,int n) {
        for(int i = 0 ; i < n ; i++) {
            System.out.print(s[i] + " ");
        }
    }


//  Counting sort
    public static void sort (int[] scores,String[] students) {
        int[] temp = new int[20];
        for(int i = 0 ; i < scores.length ; i++) {
            temp[scores[i]]++;
        }
        for(int i = 1; i < temp.length;i++) {
            temp[i] = temp[i] + temp[i-1];
        }
        int[] temp2 = new int[scores.length];
        String[] tempN = new String[students.length];

        for(int i = scores.length -1 ; i >=0;i--) {
            temp2[temp[scores[i]]-1] = scores[i];
            tempN[temp[scores[i]]-1] = students[i];
            temp[scores[i]]--;
        }
        for(int i = 0; i < scores.length;i++) {
            scores[i] = temp2[scores.length-1-i];
            students[i] = tempN[scores.length-1-i];
        }

    }

    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of student: ");
        int n = sc.nextInt();
        int[] scores = new int[n];
        String[] students = new String[n];
        for(int i = 0; i < scores.length ; i++) {
            System.out.println("Enter student " + (i+1) + " name: ");
            students[i] = sc.next();
            System.out.println("Enter student " + (i+1) + " score: ");
            scores[i] = sc.nextInt();
        }

//        String[] students = {"tuan","duong","tien","long","khanh","dung","dinh","duc","nam","hung"};
//        int[] scores = {5,7,9,2,9,4,8,1,9,3,}; //n = 10

        //
        System.out.println("List m students with highest score. m = ");
        int m = sc.nextInt();

        //Start sorting
        sort(scores,students);
        //Print m students name with scores in descendant
        print(scores,m);
        System.out.println();
        print(students,m);
    }

}

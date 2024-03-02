package Test;
import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) {
        System.out.print("Please type in a number for the size of the bottom of the triangle: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String newstar = "*";
        while (a<=1){
            System.out.print("Invalid, enter another number: ");
            a = sc.nextInt();

        }
        if(a>1){
            for(int i=1; i<=a;i++) {
                if (i == 1) {
                    System.out.println("*");
                }else if(i == a) {
                    for (int j = 1; j <= a; j++) {
                        System.out.print("*");
                    }
                }else{
                    for(int k = 1;k<i-1;k++){
                        newstar+=" ";
                    }
                    System.out.println(newstar+ "*");
                    newstar = "*";
                }
            }
        }
    }
}
package Tut1;
import Basic.BasicInput;
public class ex1 {

     static int charCount(String s){

        int number = 0;

        for(int i = 0;i < s.length();i++){
            if(Character.isAlphabetic(s.charAt(i))) {
                number++;

            }
        }

         System.out.println("Number of letters:");

        return number;
    }
    public static void main(String[] args) {

        System.out.println("****** Letter count program ****** ");

        System.out.println(charCount(BasicInput.inputSting()));
    }
}

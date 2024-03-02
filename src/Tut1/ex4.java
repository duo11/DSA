package Tut1;
import Basic.BasicInput;

public class ex4 {
    public static void main(String[] args) {

        System.out.println("******* Find name *******");

        System.out.println(findName(BasicInput.inputStringArray()));
    }
    static int findName (String[] stringArray){

        System.out.println("Which name you want to find?:");
        String targetName = BasicInput.inputSting();

        for (int i = 0; i < stringArray.length;i++){
            if(targetName.equals(stringArray[i])){
                return i;
            }
        }

        return -1;
    }
}

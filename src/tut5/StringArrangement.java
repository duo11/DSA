package tut5;


public class StringArrangement {

    public static void fill (int[] arr,int n) {
        for(int i = 0 ; i < arr.length;i++) {
            arr[i] = n;
        }
    }
    //print
    public static void print(String[] s) {
        for(int i = 0; i < s.length;i++) {
            System.out.println(s[i] + " ");
        }
    }
    //Counting sort
    public static void columnSort (String[] s,String[] str) {

        int[] temp = new int[300];

        char[] column = new char[s.length];


        for(int n =  s[0].length()-1;n >=0 ;n--){

            fill(temp, 0);

            for(int j = 0;j < s.length;j++) {
                column[j] = s[j].charAt(n);
            }


            for(int i = 0 ; i < column.length ; i++) {
                temp[column[i]]++;
            }
            for(int i = 1; i < temp.length;i++) {
                temp[i] = temp[i] + temp[i-1];
            }
            char[] temp2 = new char[column.length];
            String[] tempN = new String[str.length];

            for(int i = column.length -1 ; i >=0;i--) {
                temp2[temp[column[i]]-1] = column[i];
                tempN[temp[column[i]]-1] = str[i];
                temp[column[i]]--;
            }
            for(int i = 0; i < column.length;i++) {
                column[i] = temp2[i];
                str[i] = tempN[i];
            }
        }


    }
    //Radix sort (Complexity O(n))
    public static void radixSort (String[] s,int n,int k) {
        for(int i = k-1;i >=0;i--) {
            columnSort(s,s);
        }
    }


    public static void main(String[] args) {
        String[] s = {"NguyenTuanDuong",
                      "TranDinhHungggg",
                      "NguyenDinhViett",
                      "BuiTuanDatttttt",
                      "ManNgocDac-----"};
        radixSort(s,5,15);
        print(s);
    }
}

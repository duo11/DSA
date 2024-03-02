package Test;

public class test {
    public static void test (int n)
    {
        if (n>0)
        {
            for (int i=0; i<n;i++)
                System.out.println(i);
            test(n-1);
        }
        else if ( n == 0){
            System.out.println("end");
        }

    }

    public static void main(String[] args) {
        System.out.println(5/2);
    }
}

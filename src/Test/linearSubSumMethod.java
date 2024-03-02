package Test;

public class linearSubSumMethod {
    public static int FindMaxSubSeqSum4(int [] a)
    {
        int maxSum=a[0];

        int thisSum=0;
        for (int i=0; i<a.length; i++)//O(n)
        {
            thisSum+=a[i];
            if (thisSum > maxSum)
                maxSum=thisSum;
            if (thisSum < 0)
                thisSum=0;
        }
        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println(FindMaxSubSeqSum4(new int[]{3,-1,2,-2,10,4}));
    }
}

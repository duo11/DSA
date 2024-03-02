package tut4;

import sort.MergeSort;

public class act1 {
    public static void main(String[] args) {
        int[] a = {-3,5,1,9,-5,0,6,-1,-6};
        mergeSort(a,0,a.length-1);
        for(int i = 0; i < a.length;i++) {
            System.out.print(a[i] + " ");
        }
    }


    public static int[] mergeSort (int[] a,int left, int right) {
        if( right - left > 0 ){
            int mid = (left+right) / 2;
            mergeSort(a,left,mid);
            mergeSort(a,mid+1,right);
            merge(a,left,mid,right);
        }
        return a;

    }


    public static int[] merge (int[] a,int left,int mid,int right) {
        int i = left;
        int j = mid+1;
        int k = left;

        int[] c = new int[a.length];

        while( i <= mid && j <= right ){
            if( a[i] <= a[j] ) {
                c[k++] = a[i++];

            }
            else {
                c[k++] = a[j++];

            }

        }

        while( i <= mid) {
            c[k++] = a[i++];
        }
        while( j <= right) {
            c[k++] = a[j++];
        }

        for(i = left ;i <= right;i++) {
            a[i] = c[i];
        }

        return a;

    }
}

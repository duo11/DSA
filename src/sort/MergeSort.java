package sort;

import Basic.BasicPrint;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,2,4,7,1,3,2,6};
        mergeSort(arr,0,arr.length - 1);
        BasicPrint.printArray(arr);
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

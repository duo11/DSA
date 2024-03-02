package sort;
import Basic.BasicPrint;
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {42,7,6,33,12,26,55,5};
        quickSort(arr,0,arr.length-1);
        BasicPrint.printArray(arr);
    }

    public static int[] quickSort (int[] arr, int start, int end) {
        if (start < end) {
            int pivotPos = partition(arr, start, end);
            quickSort(arr, start, pivotPos - 1);
            quickSort(arr, pivotPos + 1, end);
        }

        return arr;
    }
    public static int partition (int[] arr, int low, int high) {
        int pivot = arr[low];
        int left = low+1;
        int right = high;


        while (left <= right) {
            if(arr[left] < pivot) {
                left++;
            }
            if(arr[right] > pivot) {
                right--;
            }
            if(arr[right] < pivot && right > left) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }

        arr[low] = arr[right];
        arr[right] = pivot;
        return right;
    }
}

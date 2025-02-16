import java.util.*;
public class QuickSort{
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partation(int[] arr, int low,int high){
        int pivot = arr[high];

        int i = low - 1;
        for (int j = low; j<= high -1; j++) {
            if(pivot > arr[j]){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }
    public static void quicksort(int[] arr, int low, int high){
        if (low < high){
            int pi = partation(arr, low, high);
            quicksort(arr, low, pi-1);
            quicksort(arr, pi + 1, high);
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Write the total");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("THe elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        quicksort(arr, 0, n-1);

        System.out.println("Sorted: ");
        for (int i = 0; i < n; i++) {
            System.out.print( arr[i] + " ");
        }
    }
}
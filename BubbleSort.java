import java.util.*;
public class BubbleSort {
    static void bubblesort(int[] arr, int n){
        int i,j,temp;
        boolean swapped;

        for(i =0;i<n-1;i++){
            swapped = false;
            for(j=0;j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    static void PrintArray(int[] arr, int size){
        for (int i = 0 ; i < size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        System.out.println();

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        bubblesort(arr, n);

        System.out.println("Sorted Array: ");
        PrintArray(arr,n);
    }
}

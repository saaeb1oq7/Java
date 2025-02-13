
import java.util.*;
public class Ssort {
    public static void Selectionsort(int arr[], int n){
        int i,j;
        for (i = 0; i < n - 1; i++) {
            int min_index = i;
            for (j = i+1; j < n ; j++) {
                if (arr[min_index] > arr[j]){
                    min_index = j;
                }
                }
                int temp;
                temp = arr[min_index];
                arr[min_index] = arr[i];
                arr[i] = temp;
            
        }    
    }
    public static void main(String[] args){
        System.out.println(" ");
        Scanner scn = new Scanner(System.in);
        System.out.println("the number of elements: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();  
        }
        Selectionsort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
  
    }
}

import java.util.*;
public class DisplayArray{
    public static void main(String[] args){
        System.out.println("");
        Scanner scn = new Scanner(System.in);
        System.out.println("the size of the list");
        int n =scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the elements:");
            arr[i] = scn.nextInt();
        }

        Display(arr, 0);

    }
    public static void Display(int[] arr , int idx) {
        if (arr.length == idx){
            return;
        }

        System.out.println(arr[idx]);

        Display(arr, idx+1);
    }
}
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        System.out.println("");
        Scanner scn = new Scanner(System.in);
        System.out.println("The size of the arr");
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the elements of the list");
            arr[i] = scn.nextInt();

        }

        Display(arr,0);
    }
    public static void Display(int[] arr, int idx) {
        if(idx == arr.length){
            return;
        }

        Display(arr, idx + 1);
        
        System.out.println(arr[idx]);
    }
}

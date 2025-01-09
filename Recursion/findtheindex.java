import java.util.*;
public class findtheindex {
    public static void main(String[] args) {
        System.out.println("");
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of the list");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println("this is your array");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("Enter the element to find");
        int x = scn.nextInt();
        
        allindex(arr, 0, x);
    }
    public static void  allindex(int[] input, int size ,int x) {
        if (size == input.length) {
            return;
        }
        allindex(input, size+1, x);
        if(input[size] == x){
            System.out.println(size);
        }
        
    }
}

import java.util.*;
public class Main1 {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("");
        Scanner scn = new Scanner(System.in);
        System.out.println("the Arraylimits");
        int n = scn.nextInt();
        System.out.println("enter the Array elements");
        int[] arr = new int[n];
        for (int i =0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println("give the number to find");
        int d = scn.nextInt();
        int ans = find(arr, d);
        System.out.println("ans = " + ans);
        
    }
    public static int find(int[] arr, int d) {
        for (int i = 0; i<arr.length; i++){
            if (arr[i] == d){
                return i;
            }
        }
        return -1;
    }
}

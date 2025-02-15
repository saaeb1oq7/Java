import java.util.*;
public class MaxOfArray1 {
    public static int findMaxrecursion(int[] arr,int index){
        if(index == arr.length-1){
            return arr[index];
        }
        int rep = findMaxrecursion(arr, index+1);
        return Math.max(arr[index], rep);
    }
    public static int findMaxItrative(int[] arr, int n){
        int max = arr[0];
        for (int i = 0; i<n;i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[n];
        Scanner scn = new Scanner(System.in);
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        System.out.println("Max  =  " + findMaxrecursion(arr, 0));
        System.out.println("Max = " + findMaxItrative(arr, n));
    }
}

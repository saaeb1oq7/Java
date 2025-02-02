import java.util.*;
public class BinarySearch{
    static int movetheelem(int[] arr, int x){
        int l = 0, r= arr.length -1;
        while(l <= r){
            int mid = l+ (r-l)/2;
            if (arr[mid] == x){
                return mid;
            }
            if (arr[mid] < x){
                l = mid +1;
            }
            else{
                r= mid -1;
            }
        }
    return -1;
    }
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("");
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the element to find ");
        int x = scn.nextInt();
        System.out.print("write down the elements you want ");
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println("the element found at " + (movetheelem(arr, x)+1));
    }
}
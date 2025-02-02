import java.util.*;
public class BinarySearch2 {
    static int movetheelem(int[] arr, int x, int l, int r){
        if (r >= l){
            int mid = l + (r - l) / 2;
        if (arr[mid] == x){
            return mid;
        }
        if (arr[mid] < x){
            return movetheelem(arr, x, mid + 1, r);
        }
        else{
            return movetheelem(arr, x, l, mid-1);
        }
        }
    return  -1;
    }
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("");
        System.out.println("");
        Scanner scn = new Scanner(System.in);
        System.out.print("Write the element to find: ");
        int x = scn.nextInt();
        int[] arr = new int[10];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < 10; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println("The element is on the " + (movetheelem(arr, x, 0, arr.length -1) + 1) + "th position");
    }
}

import java.util.Scanner;

public class INSERT1 {
public static void Insertf(int[] arr, int n){
        for (int i = 1;i < n;++i){
            int key = arr[i];
            int j=i-1;
            while(j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j = j-1;

            }
            arr[j + 1] = key;
        }
    }
    public static void main(String[] args){
        System.out.println("");
        Scanner scn = new Scanner(System.in);
        System.out.println("Write the size of the array: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        Insertf(arr, n);
        
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

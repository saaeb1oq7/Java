import java.util.Scanner;

public class MergeSort1 {

    public static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; ++i) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = arr[m + 1 + j];
        }

        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void sort(int[] arr, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    public static void main(String[] args) {
        int temp = 0;
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = scn.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        sort(arr, 0, n - 1);
        for (int j = 0; j < n; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println("");
        if(arr == null || arr.length <2){
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {

            temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
            i++;
        }
 
        for (int j = 0; j < n; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
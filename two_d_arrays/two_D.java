import java.util.*;
public class two_D{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = scn.nextInt();
        System.out.println("Enter the number of column");
        int m = scn.nextInt();
        int[][] matrix = new int[n][m];
        for(int i = 0;i<n;i++){
            for(int j =0; j<m;j++){
                matrix[i][j] = scn.nextInt();
            }
        }
        System.out.println("Printing the matrix on the screen");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
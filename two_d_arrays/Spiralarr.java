import java.util.*;
public class Spiralarr{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = scn.nextInt();
        System.out.println("Enter the number of column");
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for(int i = 0;i<n;i++){
            for(int j =0; j<m;j++){
                arr[i][j] = scn.nextInt();
            }
        }
        System.out.println("Printing the arr on the screen");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int cmin = 0;
        int rmin = 0;
        int cmax = m-1;
        int rmax = n-1;
        
        int count = 0;
        while(count<n*m){
            for (int row = rmin; row <= rmax && count< n*m; row++) {
                System.out.println(arr[row][cmin]);
                count++;
                
            }
            cmin++;
            for (int col = cmin; col<= cmax && count < n*m; col++) {
                System.out.println(arr[rmax][col]);
                count++;
            }
            rmax--;

            for(int row=rmax;row>=rmin&&count <n*m;row--){
                System.out.println(arr[row][cmax]);
                count++;
            }
            cmax--;
            for(int col = cmax; col>=cmin && count< n*m; col--){
                System.out.println(arr[rmin][col]);
                count++;
            }
            rmin++;
        }
    }
}

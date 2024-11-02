import java.util.Scanner;

public class Factorsmax {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int i,j;
        for (i = 2; i <= num; i++) {
            int count = 0;
            for (j =2;j<i ; j++) {
                if (i%j == 0){
                    count++;
                    break;
                }
            }
        if (count == 0){
            System.out.println("Prime between " + num+ " is " + i);
        }
        }

    }
    
}

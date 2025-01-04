import java.util.*;
public class Fibonacciseries {
    static int n1 = 0, n2 = 1, n3 = 0;
    public static void fibo(int count) {
        if (count > 0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            fibo(count- 1);
        }
    }
    public static void main(String[] args) {
        System.out.println("");
        Scanner scn = new Scanner(System.in);
        System.out.print("Number of Fibonacci series : ");
        int count = scn.nextInt();

        System.out.print(n1 + " " + n2);
        fibo(count-2);
    }
}

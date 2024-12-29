import java.util.*;
public class Recursion{
    public static void main(String[] args) {
        System.out.println("");
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scn.nextInt();
        printDecreasing(n);
    }   
    public static void printDecreasing(int n){

        if (n == 0) return;
        System.out.println(n);
        printDecreasing(n-1);
    }
}
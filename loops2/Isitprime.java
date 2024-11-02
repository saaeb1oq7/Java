import java.util.Scanner;

public class Isitprime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("\n");
        int num = scn.nextInt();
        boolean prime = true;
        for (int i = 2; i<num; ++i){ 
            if (num%i==0){
                prime = false;
            }
        }
        if (prime){
            System.out.println("This number (" + num +") is prime");
        }
        else{
            System.out.println("This number ("+num+") isn't prime");
        }

    }
}

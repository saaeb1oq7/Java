import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        System.out.println("");
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scn.nextInt();
        System.out.println("the factor of: " + n + " is " + factories(n));
    }
    public static int factories(int n) {
        if (n == 0 || n == 1){
            return 1;
        }

        return n*factories(n- 1);
    }
}

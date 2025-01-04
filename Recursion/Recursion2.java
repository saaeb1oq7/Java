import java.util.*;
public class Recursion2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("");

        System.out.println("Enter the number");
        int x = scn.nextInt();
        System.out.println("Enter the power");
        int p = scn.nextInt();

        int xpn = power(x , p);

        System.out.println("the power is " + xpn );
    }
    public static int power(int x, int p){
        if (p == 0){
            return 1;
        }
        int xpnb2 = power(x, p/2);

        int xn = xpnb2 * xpnb2;

        if(p%2 == 1){
            xn = xn * x;
            
        }
        return xn;
    }
}

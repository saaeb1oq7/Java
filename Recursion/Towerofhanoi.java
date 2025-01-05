import java.util.*;
public class Towerofhanoi{
    
    public static void twh(int n, int t1, int t2,int t3){
        if (n== 0){
            return;
        }
        twh(n-1, t1,t3,t2);
        System.out.println("Moving " + n + " from tower " + t1+  " to tower " + t2);
        twh(n-1,t3,t2,t1);
    }
    public static void main(String[] args) {
        System.out.println(" ");
        Scanner scn = new Scanner(System.in);

        System.out.print("the number of disks : ");
        int n = scn.nextInt();
        System.out.print("the number of tower 1 : ");
        int t1 = scn.nextInt();
        System.out.print("the number of tower 2 : ");
        int t2 = scn.nextInt();
        System.out.print("the number of tower 3 : ");
        int t3 = scn.nextInt();
        twh(n, t1, t2, t3);
    }
}
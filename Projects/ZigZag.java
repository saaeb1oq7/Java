import java.util.*;
public class ZigZag {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        zigZagPatern(n);
    }

    public static void zigZagPatern(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        zigZagPatern(n - 1);
        System.out.print(n + " ");
        zigZagPatern(n - 1);
        System.out.print(n + " ");
    }
}

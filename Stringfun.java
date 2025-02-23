import java.util.*;
public class Stringfun {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scn.nextInt();
        System.out.println("The Number " + n);

        System.out.println("Enter the String: ");
        scn.nextLine();
        String original = scn.nextLine();

        String reverse = new StringBuilder(original).reverse().toString();
        System.out.println("The Strings " + original + " <--> " + reverse);

        int length = original.length() + reverse.length();
        System.out.println("The size of the strings = " + length);

    }
}

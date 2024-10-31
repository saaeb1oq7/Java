import java.util.Scanner;

public class minmax {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number;
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        char choice;
        do { 
            System.out.println("Enter the number");
            number = scn.nextInt();
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
            System.out.println("Do you want to continue y/n");
            choice = scn.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        System.out.println("Largest number in java is "+ max );
        System.out.println("Smallest number in java is "+ min );

    }
}

import java.util.Scanner;
public class even_or_odd {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int number = num % 2;
        if (number > 0) {
            System.out.println("It's odd");
        }else{
            System.out.println("It's even");
        }
    }
}

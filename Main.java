import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        System.out.print("Write your grade ");
        Scanner scn = new Scanner(System.in);
        int marks = scn.nextInt();
        if(marks>=90 && marks<=100){
            System.out.println("Congrats you got an A");
        }else if(marks>=80 && marks<90){
            System.out.println("You got a B");
        }else{
            System.out.println("You got a C");
        }
    }
}

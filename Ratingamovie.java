import java.util.Scanner;
public class Ratingamovie {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Rate the movie ");
        int rating = scn.nextInt();
        switch(rating){
            case 1:
            System.out.println("You rated the movie 1 Stars :(");
            break;
            case 2:
            System.out.println("You rated the movie 2 Stars :(");
            break;
            case 3:
            System.out.println("You rated the movie 3 Stars :|");
            break;
            case 4:
            System.out.println("You rated the movie 4 Stars :)");
            case 5:
            System.out.println("You rated the movie 5 Stars ");
            break;
            default:
            System.out.println("INVALID!!");
            break;
        }
    }
}

import java.util.Scanner;
public class IsPalindrome {
    public static void main(String[] args){
        System.out.println("\n");
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        if(ispalindrome(str)){
            System.out.println(str + " is a palindrome.");
        }else{
            System.out.println(str + " isn't a palindrome.");
        }
    }
    public static boolean ispalindrome(String str){
        int left = 0, right = str.length()-1;
        while(left<right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }else{
                left++;
                right--;
            }
            
        }
        return true;
    }
}

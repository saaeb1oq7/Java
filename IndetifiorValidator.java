import java.util.*;
public class IndetifiorValidator {
    public boolean Indetifer(String str){
        if(str.isEmpty() || str == null){
            return false;
        }
        if(!Character.isLetter(str.charAt(0))&& str.charAt(0) != '_'){
            return false;
        }
        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(!Character.isLetterOrDigit(ch) && ch != '_'){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine().trim();
        IndetifiorValidator isValidator = new IndetifiorValidator();
        while (true) { 
            if (str.equalsIgnoreCase("exit")){
                break;
            }
            boolean isValid = isValidator.Indetifer(str);
            if(isValid){
                System.err.println("Valid /");
                break;
            }
            else{
                System.out.println("Not Valid /");
                break;
            }
        }
        
    }
}

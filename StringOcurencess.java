import java.util.*;
public class StringOcurencess {
    public String sub(String oldSub, String string, String newSub){
        if(string == null || oldSub == null || newSub == null || oldSub.isEmpty()){
            return string;
        }
        StringBuilder replaced = new StringBuilder();
        int startIndex = 0;

        int findtIndex;
        
        while ((findtIndex = string.indexOf(oldSub, startIndex)) != -1) { 
        
            replaced.append(string.substring(startIndex,findtIndex));
        
            replaced.append(newSub);
        
            startIndex = findtIndex + oldSub.length();   
        
        }
        
        if(startIndex < string.length()){
        
            replaced.append(string.substring(startIndex));
        
        }
        
        return replaced.toString();
    }
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);
        StringOcurencess obj = new StringOcurencess();

        System.out.println("\n");
        System.out.println("Enter String");
        String string = scn.nextLine();
        System.out.println("Enter oldSub");
        String oldSub = scn.nextLine();
        System.out.println("Enter new Sub");
        String newSub = scn.nextLine();

        System.out.println("the results " + obj.sub(oldSub, string, newSub));
    }
}

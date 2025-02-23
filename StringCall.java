import java.util.*;

public class StringCall {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);
        System.out.println("The String: ");
        String str1 = scn.nextLine();
        System.out.println("The String: ");
        String str2 = scn.nextLine();
        System.out.println("The String: ");
        String str3 = scn.nextLine();
        ArrayList<String> list = new ArrayList<>();
        list.add(str1);
        list.add(str2);
        list.add(str3);
        StringBuilder stringer = new StringBuilder();
        for (String element : list) {
            stringer.append(element).append(" ");
        }
        String result = stringer.toString().trim();
        System.out.println("Result: " + result);
        String sb = new StringBuilder(stringer).reverse().toString();
        System.out.println("Reverse: " + sb);
        boolean equal = str1.equals(str2);
        if (equal){
            System.out.println("The " + str1 + " is the same to " + str2);
        }else{
            System.out.println("The " + str1 + " isn't the same to " + str2);
        }

    }
}
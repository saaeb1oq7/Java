import java.util.*;
public class Anagrams {
    public static boolean AreAnagram(char[] str1, char[] str2){
        int lengtofstr1 = str1.length;
        int lengtofstr2 = str2.length;

        if (lengtofstr1 != lengtofstr2){
            return false;
        }

        Arrays.sort(str1);
        Arrays.sort(str2);

        for (int i = 0; i < lengtofstr1; i++) {
            if(str1[i] != str2[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println("\n");
        System.out.println("\n Enter the strings: ");
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);
        String string1 = scn.nextLine();
        String string2 = scn.nextLine();

        char[] str1 = string1.toCharArray();
        char[] str = string2.toCharArray();

        if(AreAnagram(str1, str)){
            System.out.println(string1 + " and " + string2 + " are Anagrams");
        }else{
            System.out.println(string1 + " and " + string2 + " aren't Anagrams");
        }

    }
}

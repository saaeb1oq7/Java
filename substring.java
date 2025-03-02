import java.util.*;
public class substring {
    public boolean subst(String str1, String str2){
        int index = str1.indexOf(str2);
        return index >= 0;
    }
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);
        substring obj = new substring();

        System.out.println("\n Enter String -- 1 :");
        String str1 = scn.nextLine();
        scn.nextLine();
        System.out.println("Enter String -- 2");
        String str2 = scn.nextLine();

        if(obj.subst(str1, str2)){
            System.out.println("Exsisting");
        }else{
            System.out.println("Not Exsisting");
        }
    }
}

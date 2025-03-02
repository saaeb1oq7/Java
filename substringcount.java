import java.util.*;
public class substringcount {
    public int sub(String str1 , String str2){
        int count = 0;
        int index = 0;

        while (index >= 0) {
            index = str1.indexOf(str2,index);
            if(index >= 0){
                count++;
                index += str2.length();
            }
        }
        return count;
    }
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        substringcount obj = new substringcount();
        System.out.println("\n");
        System.out.println("Enter String---1:");
        String str1 = sc.nextLine();
        System.out.println("Enter String---2:");
        String str2 = sc.nextLine();
        int result = obj.sub(str1, str2);
        System.out.println("is Exsisting = " + str2 + " The times is = " + result);
    }
}

import java.util.*;

public class keypad {
    public static final String[] KEYPAD = {
        "", " ", "abc", "def","ghi", "jkl", "mno", "pqrs" ,"tuv", "wxyz"
    };
    public static void countkeypad(String digets, int index, String currents, List<String> result) {
        if(index == digets.length()){
            result.add(currents);
            return;
        }

        String letters = KEYPAD[digets.charAt(index) - '0'];

        for(char i: letters.toCharArray()){
            countkeypad(digets, index + 1, currents + i, result);
        }
    }
    public static List<String> getcom(String degits){
        List<String> result = new ArrayList<>();
        if(degits == null|| degits.length() == 0){
            return result;
        }
        countkeypad(degits, 0, "", result);
        return result;
    }
    public static void main(String[] args) {
        System.out.println();
        Scanner scn = new Scanner(System.in);
        System.out.println("Write a keypad sequence:");
        String degits = scn.next();
        List<String> combinations = getcom(degits);
        System.out.println("possible combinations" + combinations);

    }
}

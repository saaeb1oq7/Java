import java.util.*;
public class SwapfirstEnd{
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(2);
        arr.add(1);
        swap(arr);
    }
    public static void swap(ArrayList<Integer> arr) {
        if(arr.size() > 1){
            int firstvalue = arr.get(0);
            int lastvalue = arr.get(arr.size()-1);
            arr.set(0, lastvalue);
            arr.set(arr.size()-1, firstvalue);
            System.out.println(arr + " reversed kinda");
        }
    }
}
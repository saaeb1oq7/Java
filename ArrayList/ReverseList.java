import java.util.*;
public class ReverseList{
    public static void main(String[] args){
        System.out.println(" ");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        ArrayList<Integer> revlist = new ArrayList<>();
        
        for (int i = list.size() -1 ; i >= 0; i--) {
            revlist.add(list.get(i));
        }
        System.out.println("array + " + list + " Reversed = " + revlist);
    }

}
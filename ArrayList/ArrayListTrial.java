import java.util.*;
public class ArrayListTrial {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.set(1, 25);
        list.remove(Integer.valueOf(30));
        list.forEach(System.out::println);
    }
}

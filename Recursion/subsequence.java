import java.util.*;
public class subsequence {
    public static void printsubsequence(int[] arr, int index, ArrayList<Integer> path) {
        if  (index == arr.length){
            if (path.size() > 0){
                System.out.println(path);
            }
            
        }
        else {
            printsubsequence(arr, index + 1, path);

            path.add(arr[index]);

            printsubsequence(arr, index + 1, path);

            path.remove(path.size() - 1);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        ArrayList<Integer> path = new ArrayList<>();

        printsubsequence(arr, 0, path);
    }
}

import java.util.*;

public class Primes {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        System.out.println("Original Array: " + arr);

        ArrayList<Integer> nonPrimes = new ArrayList<>();
        for (int num: arr) {
            if (!Prime(num)){
                nonPrimes.add(num);
            }
        }
        arr.clear();
        arr.addAll(nonPrimes);
        System.out.println("Non Primes: " + arr);
    }// it's not?

    public static boolean Prime(int arr) {
        if(arr<=1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(arr); i++) {
            if(arr%i == 0 ){
                return false;
            }
        }
        return true;
    }
}

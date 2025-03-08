import java.util.Scanner;
public class LongestPalindrome {
    public String LongestPalindrom(String str){
        int n = str.length();
        boolean[][] isPalindrome = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            isPalindrome[i][i] = true;
        }
        for(int i = 0; i < n-1; i++){
            if(str.charAt(i) == str.charAt(i + 1)){
                isPalindrome[i][i + 1] = true;
            }
        }
        for (int len = 3; len <= n; len++) {
            for (int i = 0; i <n-len+1; i++) {
                if(str.charAt(i) == str.charAt(i + len -1)&& isPalindrome[i+ 1][i + len - 2]){
                    isPalindrome[i][i + len - 1] = true;
                }
            }
        }
        int start = 0;
        int end = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if(isPalindrome[i][j] && j - i > end - start){
                    start = i;
                    end = j;
                }
            }
        }
        return str.substring(start, end + 1);
    }
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);
        LongestPalindrome obj = new LongestPalindrome();
        System.out.println("\n");
        System.out.print("Enter a String:");
        String str = scn.nextLine();

        String result = obj.LongestPalindrom(str);
        System.out.println("The Longest Palindrome : " + result);
    }
}

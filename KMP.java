import java.util.*;
public class KMP{
    void KMPsearch(String txt, String pat){
        int M = pat.length();
        int N = txt.length();

        int[] lps = new int[M];
        int j = 0;

        ComputeLpsArr(pat, M, lps);
        int i = 0;
        while((N-i) >= (M-j)){
            if(pat.charAt(j) == txt.charAt(i)){
                i++;
                j++;
            }
        if(j == M){
            System.out.println("Found at "  + (i-j));
            j = lps[j-1];
        }
        else if(i < N && pat.charAt(j) != txt.charAt(i)){
            if(j!= 0){
                j = lps[j-1];
            }
            else{
                i = i + 1;
            }
        }
        }
    }
    public void ComputeLpsArr(String pat, int M, int[] lps)  {
        int len = 0;
        int i =1;
        lps[0] = 0;

        while(i< M){
            if(pat.charAt(i) == pat.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }
            else{
                if(len != 0){
                    len = lps[len -1];
                }
                else{
                    lps[i] = len;
                    i++;
                }
            }
        }
    }
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);
        System.out.println("\n Enter txt: ");
        String txt = scn.nextLine();
        System.out.println("Enter Pat:");
        String pat = scn.nextLine();
        new KMP().KMPsearch(txt, pat);
    }
}
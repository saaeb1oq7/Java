import java.util.Scanner;

public class Counter {
    private String Stringinput;
    Counter(String Stringinput){
        this.Stringinput = Stringinput;
    }
    public void Freq(){
        int size = 256;

        int[] anyname = new int[size];

        for(char ch: Stringinput.toCharArray()){
            anyname[ch]++;
        }
        for (int i = 0; i < size; i++) {
            if(anyname[i] >0){
                System.out.println("Char = " + (char) i + " Freq = "  +anyname[i]);
            }
        }
    }
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        Counter counter = new Counter(str);
        counter.Freq();
    }

    public String getStringinput() {
        return Stringinput;
    }
}

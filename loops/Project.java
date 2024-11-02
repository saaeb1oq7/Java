public class Project {
    public static void main(String[] args) {
        System.out.println(" \n");
        int numnew = 1;
        int numold = 0;
        int run = 0;        
        do {
            run += 1;
            int numnew2 = numold + numnew;
            System.out.println(numnew + " + " + numold +" = " + numnew2 );
            numold = numnew;
            numnew = numnew2;
        } while (run < 5);
        
    }
}

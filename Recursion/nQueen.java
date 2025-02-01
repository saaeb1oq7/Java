public class nQueen {
    static int N = 4;
    static int[] ld = new int[30];
    static int[] rd = new int[30];
    static int[] cl= new int[30];
    static void printsolution(int sol[][]){
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf(" %d ", sol[i][j]);

            }
            System.out.printf("\n");
        }
    }
    static boolean findNq(int sol[][], int col){
        if (col >= N){
            return true;
        }
        for (int i = 0; i < N; i++) {
            if((ld[i - col + N -1]!= 1 && rd[i+col] != 1) && cl[i] != 1){
                sol[i][col] = 1;
                ld[i-col+N-1] = rd[i+col] = cl[i] = 1;
                if(findNq(sol, col + 1)){
                    return true;
                }
                sol[i][col]=0;
                ld[i-col+N-1] = rd[i+col] = ld[i] = 0;
            }
        }
        return false;
    }
    static boolean PrintNQ(){
        int[][] board = {{0 ,0 ,0 ,0},
                        { 0, 0, 0, 0},
                        { 0, 0, 0, 0},
                        { 0, 0, 0, 0,}};
        if (findNq(board, 0) == false){
            System.out.printf("there is no solution thhat exist");
            return false;
        }
        printsolution(board);
        return true;
    }
    public static void main(String[] args) {
        System.out.println();
        PrintNQ();
    }
}

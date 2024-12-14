
public class kadanel {
    public static void main(String[] args) {
        int[] a = {1,1,4,-1,4,1,5,-6};
        System.out.println("Max amount = " + Subforall(a));
    }
    static int Subforall(int a[]){
        int max_so_far = Integer.MIN_VALUE, max_for_here = 0;
        for (int i=0; i<8;i++){
            max_for_here = max_for_here + a[i];
            if(max_for_here > max_so_far){
                max_so_far = max_for_here;
            }
            if(max_for_here < 0){
                max_for_here = 0;
            }
            
        }
        return max_so_far;
    }
    
}

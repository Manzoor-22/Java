public class TileProblem {
    public static void main(String args[]){
        int ans = recursion(4);
        System.out.println(ans);
    }
    private static int recursion(int n){ // Floor size is 2 x n
        if(n == 0 || n == 1)
            return 1;
        // Vertical
        int fnm1 = recursion(n-1);
        // Horizontal
        int fnm2 = recursion(n-2);

        return fnm1 + fnm2;
    }
}

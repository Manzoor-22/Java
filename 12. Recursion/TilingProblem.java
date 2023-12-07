public class TilingProblem {
    public static void main(String[] args) {
        System.out.println(solution(4));
    }
    private static int solution(int n) {
        if(n == 0 || n == 1){
            return 1;
        }
        //Horizontal placement = n - 1
        int fnm1 = solution(n-1);
        //Vertical placement = n - 2
        int fnm2 = solution(n-2);

        return fnm1 + fnm2;
    }
}

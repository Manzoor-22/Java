public class ExponentOptimized {
    public static void main(String[] args) {
        System.out.println(solution(2,5));
    }
    private static int solution(int a, int n){
        if(n == 1)
            return a;
        if(n % 2 == 0)
            return (solution(a,n/2) * solution(a, n/2));
        else
            return(solution(a,1) * solution(a,n/2) * solution(a, n/2));
    }
}
